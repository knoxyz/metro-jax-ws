/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

@XmlJavaTypeAdapter(value= CurrencyAdapter.class,type= Currency.class)
package fromjava.xml_java_type_adapter_currency.server.jaxws;

import fromjava.xml_java_type_adapter_currency.server.CurrencyAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Currency;