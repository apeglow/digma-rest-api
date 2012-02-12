package de.growit.digma.api.rest;

public class Urls {
	
	public static final String ROOT_ELEMENTS = "/";
	public static final String CHILD_CATEGORIES = "/{parentId}/children/";
	public static final String DOCUMENTS = "/categories/{categoryId}/documents/";
	public static final String CATEGORY = "/{categoryId}/";
	public static final String DOCUMENT = "/documents/{documentId}/";
	
	
	public static String get(String path, Object...params) {
		StringBuilder sb = new StringBuilder();
		int currentParam = 0;
		int lastPlaceHolderEnd = -1;
		int placeHolderStart = path.indexOf("{");
		while (placeHolderStart>-1) {
			sb.append(path.substring(lastPlaceHolderEnd+1, placeHolderStart));			
			lastPlaceHolderEnd = path.indexOf("}", placeHolderStart);			
			sb.append(params[currentParam++]);
			placeHolderStart = path.indexOf("{", lastPlaceHolderEnd);
		}
		sb.append(path.substring(lastPlaceHolderEnd+1, path.length()));
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(get(DOCUMENTS, 123));
	}
	
	

}
