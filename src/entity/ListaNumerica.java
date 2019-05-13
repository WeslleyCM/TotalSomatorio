package entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ListaNumerica {
//	@JsonIgnore
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Integer> numeros;
	private Integer total=0;
	

	public ListaNumerica() {
	}
	
	public ListaNumerica(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ListaNumerica [numeros=" + numeros + ", total=" + total + "]";
	}
	
	
	public ListaNumerica add(Integer numero) {
		
		if (this.numeros == null) {
			this.numeros = new ArrayList<Integer>();
		}
		
		this.numeros.add(numero);
		
		return this;
	}
	
//	Sempre que entra nessa função ele zera o total para não ocorrer erros no total
	public Integer calcularTotal() {
		
		this.total = 0;
		
		for (Integer numero : numeros) {
			this.total += numero;
		}
		
		return this.total;
	}
	
	
//	public static void main(String[] args) {
//		ListaNumerica ln = new ListaNumerica();
//		ln.add(0).add(2).add(3).add(4);
//		ln.calcularTotal();
//		System.out.println(ln.toString());
//		
//	}
	
	
	
}
