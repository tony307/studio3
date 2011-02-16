/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.js.sdoc.lexer;

import com.aptana.editor.js.sdoc.parsing.Terminals;

public enum SDocTokenType
{
	UNDEFINED(-1),

	EOF(Terminals.EOF),
	IDENTIFIER(Terminals.IDENTIFIER),
	RCURLY(Terminals.RCURLY),
	LCURLY(Terminals.LCURLY),
	RBRACKET(Terminals.RBRACKET),
	LBRACKET(Terminals.LBRACKET),
	COLON(Terminals.COLON),
	TEXT(Terminals.TEXT),
	POUND(Terminals.POUND),
	ERROR(Terminals.ERROR),
	FUNCTION(Terminals.FUNCTION),
	ARRAY(Terminals.ARRAY),
	CLASS(Terminals.CLASS),
	COMMA(Terminals.COMMA),
	PIPE(Terminals.PIPE),
	RPAREN(Terminals.RPAREN),
	LPAREN(Terminals.LPAREN),
	CLASS_DESCRIPTION(Terminals.CLASS_DESCRIPTION),
	EXCEPTION(Terminals.EXCEPTION),
	EXTENDS(Terminals.EXTENDS),
	NAMESPACE(Terminals.NAMESPACE),
	PARAM(Terminals.PARAM),
	PROPERTY(Terminals.PROPERTY),
	RETURN(Terminals.RETURN),
	TYPE(Terminals.TYPE),
	ADVANCED(Terminals.ADVANCED),
	ALIAS(Terminals.ALIAS),
	AUTHOR(Terminals.AUTHOR),
	CONSTRUCTOR(Terminals.CONSTRUCTOR),
	EXAMPLE(Terminals.EXAMPLE),
	INTERNAL(Terminals.INTERNAL),
	METHOD(Terminals.METHOD),
	OVERVIEW(Terminals.OVERVIEW),
	PRIVATE(Terminals.PRIVATE),
	SEE(Terminals.SEE),
	UNKNOWN(Terminals.UNKNOWN),
	END_DOCUMENTATION(Terminals.END_DOCUMENTATION),
	ARROW(Terminals.ARROW),
	LESS_THAN(Terminals.LESS_THAN),
	GREATER_THAN(Terminals.GREATER_THAN),
	ELLIPSIS(Terminals.ELLIPSIS),
	START_DOCUMENTATION(Terminals.START_DOCUMENTATION),
	PROPERTIES(Terminals.PROPERTIES),

	WHITESPACE(42),
	TYPES(43),
	VALUE(44);

	private short _index;

	private SDocTokenType(short beaverId)
	{
		this._index = beaverId;
	}

	private SDocTokenType(int index)
	{
		this((short) index);
	}

	/**
	 * getIndex
	 * 
	 * @return
	 */
	public short getIndex()
	{
		return this._index;
	}
}
