/* *********************************************************************** *
 * project: org.matsim.*
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2016 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.pt2matsim.gtfs.lib;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

/**
 * @author polettif
 */
public interface Service {

	Collection<LocalDate> getCoveredDays();

	String getId();

	boolean[] getDays();

	LocalDate getStartDate();

	LocalDate getEndDate();

	Collection<LocalDate> getAdditions();

	Collection<LocalDate> getExceptions();

	Map<String, Trip> getTrips();

	/**
	 * @return <code>true</code> if the given date is used by the given service.
	 */
	boolean runsOnDate(LocalDate extractDate);
}
