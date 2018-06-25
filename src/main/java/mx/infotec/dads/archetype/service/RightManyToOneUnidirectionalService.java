/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 kukulkan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.archetype.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mx.infotec.dads.archetype.domain.RightManyToOneUnidirectional;

/**
 * RightManyToOneUnidirectionalService
 * 
 * @author kukulkan
 * @kukulkanGenerated 20180625150003
 */
public interface RightManyToOneUnidirectionalService {

    /**
     * regresa una lista con todos los elementos RightManyToOneUnidirectional
     * 
     * @return Page<RightManyToOneUnidirectional>
     */
    Page<RightManyToOneUnidirectional> findAll(Pageable pageable);

    /**
     * Consulta un RightManyToOneUnidirectional por su llave primaria
     * 
     * @param id
     * @return RightManyToOneUnidirectional
     */
    RightManyToOneUnidirectional findById(Long id);

    /**
     * Guarda o actualiza un RightManyToOneUnidirectional
     * 
     * @param rightManyToOneUnidirectional
     * @return boolean
     */
    RightManyToOneUnidirectional save(RightManyToOneUnidirectional rightManyToOneUnidirectional);

    /**
     * Regresa true o false si existe un RightManyToOneUnidirectional almacenado
     * 
     * @param id
     * @return boolean
     */
    boolean exists(Long id);

    /**
     * Borrar un RightManyToOneUnidirectional por su llave primaria
     * 
     * @param id
     */
    void delete(Long id);

    /**
     * Borrar todos los elementos RightManyToOneUnidirectional almacenados
     * 
     * @param id
     */
    void deleteAll();
    
    /**
     * Buscar RightManyToOneUnidirectional con el correspondiente al query.
     *
     *  @param query El query de la busqueda
     *  
     *  @param pageable la información de paginación
     *  @return Page de todas las entidades
     */
    Page<RightManyToOneUnidirectional> search(String query, Pageable pageable);
}
