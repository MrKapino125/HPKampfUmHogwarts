package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

import cards.Card;
import hogwarts.*;


public class Init {
	public static Dictionary<Integer, HashMap<String, Integer>> character;
	public static Dictionary<Integer, HashMap<String, Integer>> level;
	
	public static Object createInstance(String className) {
		Class<?> c;
		try {
			c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return new Alohomora();
		}
		try {
			return c.getDeclaredConstructor().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Alohomora();
	}
	
	public static void init() {
		character = new Hashtable<Integer, HashMap<String, Integer>>();
		character.put(0, new HashMap<String, Integer>());
		character.put(1, new HashMap<String, Integer>());
		character.put(2, new HashMap<String, Integer>());
		character.put(3, new HashMap<String, Integer>());
		character.get(0).put("Alohomora", 7);
		character.get(1).put("Alohomora", 7);
		character.get(2).put("Alohomora", 7);
		character.get(3).put("Alohomora", 7);
		
		character.get(0).put("Feuerblitz", 1);
		character.get(0).put("Hedwig", 1);
		character.get(0).put("Tarnumhang", 1);
		
		character.get(1).put("BeedleDemBarden", 1);
		character.get(1).put("Zeitumkehrer", 1);
		character.get(1).put("Krummbein", 1);
		
		character.get(2).put("Pigwidgeon", 1);
		character.get(2).put("Sauberwisch11", 1);
		character.get(2).put("BohnenJederGeschmacksrichtungen", 1);
		
		character.get(3).put("Trevor", 1);
		character.get(3).put("Erinnermich", 1);
		character.get(3).put("Alraune", 1);
	}
}
