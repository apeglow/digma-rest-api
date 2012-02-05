package de.growit.digma.api.rest;

public class Urls {
	
	public static String forRootElements() {
		return "/";
	}
	
	public static String forChildCategories(long parentId) {
		return "/"+parentId+"/children/";
	}
	
	public static String forDocuments(long categoryId) {
		return "/categories/"+categoryId+"/documents/";
	}
	
	
	

}
