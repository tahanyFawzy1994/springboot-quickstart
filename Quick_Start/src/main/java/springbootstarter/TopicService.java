package springbootstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Topic;

@Service
public class TopicService {

	private List<Topic> allTopics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "spring framework", "spring framework desc"),
			new Topic("java", "Core java", "java desc"), new Topic("javascript", "javascript", "javascript desc")));

	public List<Topic> getAllTopics() {
		return allTopics;
	}

	public Topic getTopic(String id) {
		return allTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		allTopics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < allTopics.size(); i++) {
			Topic t = allTopics.get(i);
			if (t.getId().equals(id)) {
				allTopics.set(i, topic);
				return;
			}
		}

	}

	public void deleteTopic(String id) {
		allTopics.removeIf(t -> t.getId().equals(id));
	}
}
