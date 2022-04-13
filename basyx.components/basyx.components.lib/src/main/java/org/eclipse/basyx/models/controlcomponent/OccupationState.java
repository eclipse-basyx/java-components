/*******************************************************************************
 * Copyright (C) 2021 the Eclipse BaSyx Authors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * SPDX-License-Identifier: MIT
 ******************************************************************************/
package org.eclipse.basyx.models.controlcomponent;

/**
 * Occupation state enum
 * 
 * @author kuhn
 *
 */
public enum OccupationState {
	// Enumeration constants
	FREE(0), OCCUPIED(1), PRIORITY(2), LOCAL(3);

	/**
	 * Get OccupationState by its value
	 */
	public static OccupationState byValue(int value) {
		// Switch by requested value
		switch (value) {
		case 0:
			return FREE;
		case 1:
			return OCCUPIED;
		case 2:
			return PRIORITY;
		case 3:
			return LOCAL;
		}

		// Indicate error
		throw new RuntimeException("Unknown value requested");
	}

	/**
	 * Enumeration item value
	 */
	protected int value = -1;

	/**
	 * Constructor
	 */
	private OccupationState(int val) {
		this.value = val;
	}

	/**
	 * Get enumeration value
	 */
	public int getValue() {
		return value;
	}
}
