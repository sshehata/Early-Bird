package engine;

import java.util.Date;
import java.util.LinkedList;

public class GlobalSettings {
	
	private static String alarmName;
	private static Date alarmTime;
	private static byte alarmRepeat;
	private static String alarmLocation;
	private static LinkedList<String> alarmTone;
	private static boolean alarmIgnoreMuted;
	private static boolean alarmShakeToSnooze;
	private static boolean alarmAutoSnooze;
	private static short alarmSnoozeCount;
	private static short alarmSnoozeDur;
	private static byte alarmType;
	
	private static LinkedList<String> locations;
	
	private static byte journalInputMethod;
	private static byte journalAskInputMethod;
	
	private static boolean showTips;
	private static short maxLosses;  // when max losses exceeded, back to snooze
	private static byte difficulty;
			// 0 - EASY
			// 1 - MEDIUM
			// 2 - HARD
	
	
	public static String getAlarmName() {
		return alarmName;
	}
	public static void setAlarmName(String alarmName) {
		GlobalSettings.alarmName = alarmName;
	}
	public static Date getAlarmTime() {
		return alarmTime;
	}
	public static void setAlarmTime(Date alarmTime) {
		GlobalSettings.alarmTime = alarmTime;
	}
	public static byte getAlarmRepeat() {
		return alarmRepeat;
	}
	public static void setAlarmRepeat(byte alarmRepeat) {
		GlobalSettings.alarmRepeat = alarmRepeat;
	}
	public static String getAlarmLocation() {
		return alarmLocation;
	}
	public static void setAlarmLocation(String alarmLocation) {
		GlobalSettings.alarmLocation = alarmLocation;
	}
	public static LinkedList<String> getAlarmTone() {
		return alarmTone;
	}
	public static void setAlarmTone(LinkedList<String> alarmTone) {
		GlobalSettings.alarmTone = alarmTone;
	}
	public static boolean isAlarmIgnoreMuted() {
		return alarmIgnoreMuted;
	}
	public static void setAlarmIgnoreMuted(boolean alarmIgnoreMuted) {
		GlobalSettings.alarmIgnoreMuted = alarmIgnoreMuted;
	}
	public static boolean isAlarmShakeToSnooze() {
		return alarmShakeToSnooze;
	}
	public static void setAlarmShakeToSnooze(boolean alarmShakeToSnooze) {
		GlobalSettings.alarmShakeToSnooze = alarmShakeToSnooze;
	}
	public static boolean isAlarmAutoSnooze() {
		return alarmAutoSnooze;
	}
	public static void setAlarmAutoSnooze(boolean alarmAutoSnooze) {
		GlobalSettings.alarmAutoSnooze = alarmAutoSnooze;
	}
	public static short getAlarmSnoozeCount() {
		return alarmSnoozeCount;
	}
	public static void setAlarmSnoozeCount(short alarmSnoozeCount) {
		GlobalSettings.alarmSnoozeCount = alarmSnoozeCount;
	}
	public static short getAlarmSnoozeDur() {
		return alarmSnoozeDur;
	}
	public static void setAlarmSnoozeDur(short alarmSnoozeDur) {
		GlobalSettings.alarmSnoozeDur = alarmSnoozeDur;
	}
	public static byte getAlarmType() {
		return alarmType;
	}
	public static void setAlarmType(byte alarmType) {
		GlobalSettings.alarmType = alarmType;
	}
	public static LinkedList<String> getLocations() {
		return locations;
	}
	public static void setLocations(LinkedList<String> locations) {
		GlobalSettings.locations = locations;
	}
	public static byte getJournalInputMethod() {
		return journalInputMethod;
	}
	public static void setJournalInputMethod(byte journalInputMethod) {
		GlobalSettings.journalInputMethod = journalInputMethod;
	}
	public static byte getJournalAskInputMethod() {
		return journalAskInputMethod;
	}
	public static void setJournalAskInputMethod(byte journalAskInputMethod) {
		GlobalSettings.journalAskInputMethod = journalAskInputMethod;
	}
	public static boolean isShowTips() {
		return showTips;
	}
	public static void setShowTips(boolean showTips) {
		GlobalSettings.showTips = showTips;
	}
	public static short getMaxLosses() {
		return maxLosses;
	}
	public static void setMaxLosses(short maxLosses) {
		GlobalSettings.maxLosses = maxLosses;
	}
	public static byte getDifficulty() {
		return difficulty;
	}
	public static void setDifficulty(byte difficulty) {
		GlobalSettings.difficulty = difficulty;
	}
	
	
}
