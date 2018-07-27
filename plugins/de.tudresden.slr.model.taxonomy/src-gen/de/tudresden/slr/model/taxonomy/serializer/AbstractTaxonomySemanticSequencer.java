/*
 * generated by Xtext
 */
package de.tudresden.slr.model.taxonomy.serializer;

import com.google.inject.Inject;
import de.tudresden.slr.model.taxonomy.Model;
import de.tudresden.slr.model.taxonomy.TaxonomyPackage;
import de.tudresden.slr.model.taxonomy.Term;
import de.tudresden.slr.model.taxonomy.services.TaxonomyGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public abstract class AbstractTaxonomySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TaxonomyGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TaxonomyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TaxonomyPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TaxonomyPackage.TERM:
				sequence_Term(context, (Term) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (dimensions+=Term dimensions+=Term*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Term returns Term
	 *
	 * Constraint:
	 *     (name=ID (subclasses+=Term subclasses+=Term*)?)
	 */
	protected void sequence_Term(ISerializationContext context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
