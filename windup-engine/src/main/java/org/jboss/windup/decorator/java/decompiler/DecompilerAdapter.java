/*
 * Copyright (c) 2013 Red Hat, Inc. and/or its affiliates.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Brad Davis - bradsdavis@gmail.com - Initial API and implementation
*/
package org.jboss.windup.decorator.java.decompiler;

import java.io.File;

/**
 * Facade to the Decompiler implementation.
 * 
 * @author bdavis
 * 
 */
public interface DecompilerAdapter {
	public abstract void decompile(String className, String classLocation, String sourceOutputLocation);

	public abstract void decompile(String className, File classLocation, File sourceOutputLocation);
}