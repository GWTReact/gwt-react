/*******************************************************************************
 * Copyright (c) Aviaso Software Inc.
 * All rights reserved. 
 * No part of this work may be reproduced in any form without the written
 * permission of Aviaso Software Inc.
 * This work is the property of Aviaso Software Inc. and may not be disclosed
 * to any third party without the written permission of Aviaso Software Inc.
 *******************************************************************************/

package gwt.react.client.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A representation of the constructor JavaScript function of a {@link JsType} class.
 */
@JsFunction
public interface JsTypeConstructor<T> {
	@JsType
	class Utils {
		@JsMethod(namespace = JsPackage.GLOBAL)
		public static native Object eval(String str);
	}
	
	Object invoke(Object... args);

	/**
	 * Works only when:
	 * * T is annotated with the {@link JsType} annotation
	 * * The JavaScript class exported via JSInterop was NOT renamed using the 'namespace' or 'name' attributes of the {@link JsType} annotation.
	 * 
	 * For all other cases, the function has undefined results.
	 */
	@JsOverlay
	public static <T> JsTypeConstructor<T> get(Class<T> clazz) {
		return get(clazz.getName());
	}
	
	@SuppressWarnings("unchecked")
	@JsOverlay
	public static <T> JsTypeConstructor<T> get(String jsTypeName) {
		return (JsTypeConstructor<T>)Utils.eval(jsTypeName);
	}
}
