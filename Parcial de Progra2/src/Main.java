import java.util.ArrayList;
import java.util.List;

abstract class Postre {
    private String nombre;
    private String tamaño;
    private double precio;
    private List<Ingrediente> listaIngredientes;

    public Postre(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.listaIngredientes = new ArrayList<>();
    }

    public abstract void preparar();

    public void servir() {
        System.out.println("Sirviendo " + nombre);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        listaIngredientes.add(ingrediente);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}


class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, String tipoMasa) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Crepa con masa: " + tipoMasa);
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }
}

class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, String sabor) {
        super(nombre, tamaño, precio);
        this.sabor = sabor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pastel con sabor: " + sabor);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}

class Cheesecake extends Postre {
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, String tipoQueso) {
        super(nombre, tamaño, precio);
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Cheesecake con queso: " + tipoQueso);
    }


    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }
}

class Brownie extends Postre {
    private String tipoChocolate;

    public Brownie(String nombre, String tamaño, double precio, String tipoChocolate) {
        super(nombre, tamaño, precio);
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Brownie con chocolate: " + tipoChocolate);
    }


    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }
}


interface Ingrediente {
    String obtenerNombre();
    int obtenerCantidad();
}


class Masa implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Masa(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Masa de tipo: " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

class Relleno implements Ingrediente {
    private String sabor;
    private int cantidad;

    public Relleno(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Relleno de sabor: " + sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    // Getters y setters
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

class Cobertura implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Cobertura(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Cobertura de tipo: " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}


class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<Postre> especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Postre postre) {
        especialidades.add(postre);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Postre> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Postre> especialidades) {
        this.especialidades = especialidades;
    }
}


class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

    public void tomarOrden() {
        System.out.println(nombre + " está tomando una orden.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo equipo: " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando equipo: " + tipo);
    }

    public void reparar() {
        System.out.println("Reparando equipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
