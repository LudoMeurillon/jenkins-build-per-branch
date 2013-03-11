package com.entagen.jenkins

class BranchView {
    String templateJobPrefix
    String branchName

    public String getViewName() {
		List nameParts = "$safeBranchName".tokenize('_');
		return nameParts.get(nameParts.size-1);
    }

    public String getSafeBranchName() {
        return branchName.replaceAll('/', '_')
    }


    public String toString() {
        return this.viewName
    }
}
