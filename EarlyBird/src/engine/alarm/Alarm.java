package engine.alarm;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

import engine.GlobalSettings;

/**
 * @author Samy Shihata 
 * @author Ali Said  
 *
 */
public class Alarm{	
	
	private String name;
	private boolean active;
	private Date time;
	private byte daysOfWeek;
	private LinkedList<String> tones;
	private byte type;
		// 0 - none
		// 1 - vibrate
		// 2 - sound
		// 3 - both
	private byte repeat;     // set alarm repeat
		// 0 - none
		// 1 - weekly
		// 2 - monthly
	private short snoozeTime;  // in minutes
	private short snoozeCount; // number of snoozes before force cancel
	private String location;   // to be changed
	private boolean shakeToSnooze;
	private boolean autoSnooze;
	private boolean ignoreMuted;
	
	// default constructor
	public Alarm() {
		name = GlobalSettings.getAlarmName();
		active = true;
		time = new Date(GlobalSettings.getAlarmTime().getTime());
		tones = new LinkedList<String>(GlobalSettings.getAlarmTone());
		type = GlobalSettings.getAlarmType();
		repeat = GlobalSettings.getAlarmRepeat();
		snoozeTime = GlobalSettings.getAlarmSnoozeDur();
		snoozeCount = GlobalSettings.getAlarmSnoozeCount();
		location = GlobalSettings.getAlarmLocation();
		shakeToSnooze = GlobalSettings.isAlarmShakeToSnooze();
		autoSnooze = GlobalSettings.isAlarmAutoSnooze();
		ignoreMuted = GlobalSettings.isAlarmIgnoreMuted();
		
		Calendar cal = Calendar.getInstance();
		daysOfWeek = (byte) (1 << cal.get(Calendar.DAY_OF_WEEK));
	}
	
	// copy constructor
	public Alarm(Alarm alarm) {
		Alarm alarmCopy = new Alarm();
		alarmCopy.name = name;
		alarmCopy.active = active;
		alarmCopy.time = new Date(time.getTime());
		alarmCopy.autoSnooze = autoSnooze;
		alarmCopy.daysOfWeek = daysOfWeek;
		alarmCopy.location = location;
		alarmCopy.repeat = repeat;
		alarmCopy.shakeToSnooze = shakeToSnooze;
		alarmCopy.snoozeCount = snoozeCount;
		alarmCopy.snoozeTime = snoozeTime;
		alarmCopy.tones = new LinkedList<String>(tones);
		alarmCopy.type = type;
		alarmCopy.ignoreMuted = ignoreMuted;
	}

}
