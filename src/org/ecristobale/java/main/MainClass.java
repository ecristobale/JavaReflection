package org.ecristobale.java.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.ecristobale.java.model.ClaseCualquieraA;
import org.ecristobale.java.model.ClaseCualquieraB;

public class MainClass {

	public static void main(String[] args) {
		ClaseCualquieraA a = instanceByReflection();
		System.out.println("CLASE A: atributo ANTES: " + a.getAtributoB());
		executeOperationAMethod(a);
		System.out.println("CLASE A: atributo DESPUES: " + a.getAtributoB());

		ClaseCualquieraB b = new ClaseCualquieraB(2, "conca", true, "tena");
		System.out.println("CLASE B: atributo ANTES: " + b.getAtributoB());
		executeOperationAMethod(b);
		System.out.println("CLASE B: atributo DESPUES: " + b.getAtributoB());
	}

	private static void executeOperationAMethod(Object o) {
		try {
			Class anyClass = Class.forName(o.getClass().getCanonicalName());
			Method methodOpA = anyClass.getMethod("operationA");
			methodOpA.invoke(o, null);

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	private static ClaseCualquieraA instanceByReflection() {
		try {
			Class classA = Class.forName(ClaseCualquieraA.class.getCanonicalName());
			Constructor<ClaseCualquieraA> constructorA = (Constructor<ClaseCualquieraA>) classA.getConstructor(java.lang.String.class,int.class,boolean.class,int.class);
			return (ClaseCualquieraA) constructorA.newInstance("str", 1, true, 9);
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
