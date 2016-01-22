/**
 *
 * $Id$
 */
package de.tudresden.slr.model.taxonomy.validation;

import de.tudresden.slr.model.taxonomy.Term;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.tudresden.slr.model.taxonomy.Model}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelValidator {
	boolean validate();

	boolean validateDimensions(EList<Term> value);
}