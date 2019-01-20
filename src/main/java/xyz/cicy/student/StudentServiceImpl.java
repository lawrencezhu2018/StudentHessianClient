package xyz.cicy.student;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService
{
	private Map<String, Double> nameScoreMap = new HashMap<>();

	{
		nameScoreMap.put("cc", (double) 100);
		nameScoreMap.put("zz", (double) 85);
	}

	@Override
	public double findScore(String name)
	{
		Double score = nameScoreMap.get(name);

		if (score == null)
		{
			return 0;
		}

		return score;
	}
}
