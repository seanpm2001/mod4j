/** Generated by Mod4j at Thu May 15 22:41:57 CEST 2008
 */
package org.company.recordshop.data.spring.dao;

import java.util.List;

import org.company.recordshop.domain.Record;

/**
 * RecordDao Data Access Object (DAO). Responsible for accessing the forum database.
 * 
 * @author Mod4j generated
 * 
 */
public interface RecordDao {

	/**
	 * Retrieves a Record by its ID from the database.
	 * 
	 * @param id
	 *                id of the Record to retrieve.
	 * @return Record retrieved or null when no Record was found.
	 */
	Record retrieve(long id);

	/**
	 * Adds a new Record to the database
	 * 
	 * @param record
	 *                the Record to add to the database.
	 * @return the stored Record.
	 */
	Record add(Record record);

	/**
	 * Stores/Updates the Record in the database. Inclusive all its posts.
	 * 
	 * @param record
	 *                the Record to store/update
	 * @return
	 */
	Record update(Record record);

	/**
	 * Deletes a Record from the database.
	 * 
	 * @param record
	 *                the Record to delete
	 */
	void delete(Record record);

	/**
	 * Selects all Records from the database.
	 * 
	 * @return a List of all Record objects.
	 */
	List<Record> listAllRecords();
}
