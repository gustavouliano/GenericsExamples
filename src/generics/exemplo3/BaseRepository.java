package generics.exemplo3;

public interface BaseRepository<T> {
	
	/**
	 * Salva os dados no reposit�rio.
	 * @param data
	 * @return
	 */
	T save(T data);
	
	/**
	 * Realiza a busca de um dado pelo seu id.
	 * @param id
	 * @return
	 */
	T findOne(String id);
	
	/**
	 * Realiza a busca de todos os dados.
	 * @return
	 */
	T[] findAll();
	
	/**
	 * Realiza a exclus�o de um dado pelo seu id.
	 * @param id
	 * @return
	 */
	boolean delete(String id);
}
