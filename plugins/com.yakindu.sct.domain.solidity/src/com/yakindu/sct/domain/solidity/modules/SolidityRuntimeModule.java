/**
 * Copyright (c) 2017 itemis AG - All rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * 
 * Contributors:
 * 	Andreas Muelder - itemis AG
 * 	Florian Antony - itemis AG
 * 
 */
package com.yakindu.sct.domain.solidity.modules;

import org.yakindu.base.types.inferrer.ITypeSystemInferrer;
import org.yakindu.base.types.typesystem.ITypeSystem;
import org.yakindu.sct.domain.extension.DomainRegistry;
import org.yakindu.sct.model.stext.STextRuntimeModule;
import org.yakindu.sct.model.stext.validation.STextJavaValidator;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.yakindu.sct.domain.solidity.typesystem.SolidityTypeInferrer;
import com.yakindu.sct.domain.solidity.typesystem.SolidityTypeSystem;
import com.yakindu.sct.domain.solidity.validation.SolidityJavaValidator;

public class SolidityRuntimeModule extends STextRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named(DomainRegistry.DOMAIN_ID))
				.toInstance("com.yakindu.domain.solidity");
	}

	@Override
	protected ITypeSystem getTypeSystem() {
		return SolidityTypeSystem.getInstance();
	}

	@Override
	@org.eclipse.xtext.service.SingletonBinding(eager = true)
	public Class<? extends STextJavaValidator> bindSTextJavaValidator() {
		return SolidityJavaValidator.class;
	}

	@Override
	public Class<? extends ITypeSystemInferrer> bindITypeSystemInferrer() {
		return SolidityTypeInferrer.class;
	}
}