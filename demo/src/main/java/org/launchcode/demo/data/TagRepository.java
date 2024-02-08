package org.launchcode.demo.data;

import org.launchcode.demo.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {
}