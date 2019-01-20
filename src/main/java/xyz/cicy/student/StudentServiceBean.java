package xyz.cicy.student;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceBean
{
	@Autowired
	private StudentService service;

	public double findScore(String name)
	{
		return service.findScore(name);
	}
}
