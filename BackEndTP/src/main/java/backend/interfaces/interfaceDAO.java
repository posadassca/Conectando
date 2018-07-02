package backend.interfaces;

import java.util.List;

public interface interfaceDAO <T> {

		
		public T crear(T t);
		public void eliminar(T t);	
		public T porId(long id);	
		public List<T> todos();
		public T actualizar(T t);

}