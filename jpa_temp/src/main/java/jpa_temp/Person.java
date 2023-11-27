package jpa_temp;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float czas;

	private double kwota;

	private double oprocentowanie;

	private float wynik;

	public Person() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCzas() {
		return this.czas;
	}

	public void setCzas(float czas) {
		this.czas = czas;
	}

	public double getKwota() {
		return this.kwota;
	}

	public void setKwota(double kwota) {
		this.kwota = kwota;
	}

	public double getOprocentowanie() {
		return this.oprocentowanie;
	}

	public void setOprocentowanie(double oprocentowanie) {
		this.oprocentowanie = oprocentowanie;
	}

	public float getWynik() {
		return this.wynik;
	}

	public void setWynik(float wynik) {
		this.wynik = wynik;
	}

}