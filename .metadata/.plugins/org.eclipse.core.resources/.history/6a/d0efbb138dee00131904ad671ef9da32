package engine.alarm;

import java.util.LinkedList;

/**
 * @author Samy Shihata
 * @author Ali Said
 *
 */
public class AlarmManager {
	
	private LinkedList<Alarm> alarms;
	
	public AlarmManager() {
		//TODO: find a way to persist through restart
		alarms = new LinkedList<Alarm>();
	}
	
	public void addAlarm(Alarm alarm) {
		alarms.add(alarm);
	}
	
	public void deleteAlarm(int i) {
		alarms.remove(i);
	}
	
	public void duplicateAlarm(int i) {
		alarms.add(alarms.get(i));
	}
}
