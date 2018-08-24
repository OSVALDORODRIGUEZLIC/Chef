package com.netasystem.recetario.contenido;

import java.util.List;

public class Recetas {

	public Recetas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recetas(String nombrechef, String nombreReceta, List<String> ingredientes, String pasosReceta) {
		super();
		this.nombrechef = nombrechef;
		this.nombreReceta = nombreReceta;
		this.ingredientes = ingredientes;
		this.pasosReceta = pasosReceta;
	}

	private String nombrechef;

	private String nombreReceta;

	private List<String> ingredientes;

	private String pasosReceta;

	public String getNombrechef() {
		return nombrechef;
	}

	public void setNombrechef(String nombrechef) {
		this.nombrechef = nombrechef;
	}

	public String getNombreReceta() {
		return nombreReceta;
	}

	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getPasosReceta() {
		return pasosReceta;
	}

	public void setPasosReceta(String pasosReceta) {
		this.pasosReceta = pasosReceta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nombreReceta == null) ? 0 : nombreReceta.hashCode());
		result = prime * result + ((nombrechef == null) ? 0 : nombrechef.hashCode());
		result = prime * result + ((pasosReceta == null) ? 0 : pasosReceta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recetas other = (Recetas) obj;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nombreReceta == null) {
			if (other.nombreReceta != null)
				return false;
		} else if (!nombreReceta.equals(other.nombreReceta))
			return false;
		if (nombrechef == null) {
			if (other.nombrechef != null)
				return false;
		} else if (!nombrechef.equals(other.nombrechef))
			return false;
		if (pasosReceta == null) {
			if (other.pasosReceta != null)
				return false;
		} else if (!pasosReceta.equals(other.pasosReceta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recetas [nombrechef=" + nombrechef + ", nombreReceta=" + nombreReceta + ", ingredientes=" + ingredientes
				+ ", pasosReceta=" + pasosReceta + "]";
	}
	
	
	
}
