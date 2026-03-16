@Override
public boolean equals(Object obj) {

    if (this == obj) return true;

    if (obj == null || getClass() != obj.getClass()) return false;

    HoraExacta otra = (HoraExacta) obj;

    return this.segundos == otra.segundos 
           this.getHora() == otra.getHora() 
           this.getMinutos() == otra.getMinutos();
}
