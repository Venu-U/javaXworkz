package com.xworkz.boot;

import com.xworkz.app.Project;
import com.xworkz.app.SoftwareProject;

public class ProjectKiller {

	public static void main(String[] args) {

		Project project=new SoftwareProject();
		project.celebrate();
		project.complete();
		project.displayInfo();
		project.implement();
		project.prioritize();
		project.review();
		project.scheduleMeeting();
		project.start();
		project.updateStatus();
		project.test();

	}

}
