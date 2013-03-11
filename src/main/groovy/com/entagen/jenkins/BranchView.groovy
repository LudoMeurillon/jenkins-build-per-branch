package com.entagen.jenkins

class BranchView {
    String templateJobPrefix
    String branchName
	int limit = 25

    public String getViewName() {
		List nameParts = "$safeBranchName".tokenize('_');
		String viewName = nameParts.get(nameParts.size-1);
		if(viewName.length > limit){
			viewName = viewName.subString(0,limit-3)+"...";
		}
		return viewName;
    }

    public String getSafeBranchName() {
        return branchName.replaceAll('/', '_')
    }


    public String toString() {
        return this.viewName
    }
}
