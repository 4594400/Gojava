package com.goit.module_6.exampleMyException;


import java.util.List;

public class Directory {

	private List<TextFile> textfile;
	private List<AudioFile> audiofile;
	private List<ImageFile> imagefile;
	
	public List<TextFile> getTextfile() {
	 	 return textfile; 
	}
	
	public void setTextfile(List<TextFile> textfile) {
		 this.textfile = textfile; 
	}
	
	public List<AudioFile> getAudiofile() {
	 	 return audiofile; 
	}
	
	public void setAudiofile(List<AudioFile> audiofile) {
		 this.audiofile = audiofile; 
	}
	
	public List<ImageFile> getImagefile() {
	 	 return imagefile; 
	}
	
	public void setImagefile(List<ImageFile> imagefile) {
		 this.imagefile = imagefile; 
	} 

}