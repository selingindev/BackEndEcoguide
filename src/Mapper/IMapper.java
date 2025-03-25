package Mapper;

public interface IMapper<T, D> {

    public D toDTO(T entity);

    public T toEntity(D dto);

}