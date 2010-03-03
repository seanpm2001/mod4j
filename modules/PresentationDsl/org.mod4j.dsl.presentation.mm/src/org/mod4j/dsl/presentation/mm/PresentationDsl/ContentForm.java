/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getContentForm()
 * @model
 * @generated
 */
public interface ContentForm extends Dialogue {
    /**
     * Returns the value of the '<em><b>Form Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Form Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Form Elements</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getContentForm_FormElements()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm
     * @model opposite="form" containment="true"
     * @generated
     */
    EList<FormElement> getFormElements();

    /**
     * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm <em>Content Form</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actions</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getContentForm_Actions()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm
     * @model opposite="contentForm" containment="true"
     * @generated
     */
    EList<org.mod4j.dsl.presentation.mm.PresentationDsl.Process> getActions();

} // ContentForm
