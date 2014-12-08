/**
 */
package org.scaledl.architecturaltemplates.type.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.scaledl.architecturaltemplates.type.util.TypeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class TypeItemProviderAdapterFactory extends TypeAdapterFactory implements ComposeableAdapterFactory,
        IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.AT} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ATItemProvider atItemProvider;

    /**
     * This creates an adapter for a {@link org.scaledl.architecturaltemplates.type.AT}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createATAdapter() {
        if (this.atItemProvider == null) {
            this.atItemProvider = new ATItemProvider(this);
        }

        return this.atItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.Parameter} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ParameterItemProvider parameterItemProvider;

    /**
     * This creates an adapter for a {@link org.scaledl.architecturaltemplates.type.Parameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createParameterAdapter() {
        if (this.parameterItemProvider == null) {
            this.parameterItemProvider = new ParameterItemProvider(this);
        }

        return this.parameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.Repository} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected RepositoryItemProvider repositoryItemProvider;

    /**
     * This creates an adapter for a {@link org.scaledl.architecturaltemplates.type.Repository}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRepositoryAdapter() {
        if (this.repositoryItemProvider == null) {
            this.repositoryItemProvider = new RepositoryItemProvider(this);
        }

        return this.repositoryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.Role} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected RoleItemProvider roleItemProvider;

    /**
     * This creates an adapter for a {@link org.scaledl.architecturaltemplates.type.Role}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRoleAdapter() {
        if (this.roleItemProvider == null) {
            this.roleItemProvider = new RoleItemProvider(this);
        }

        return this.roleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.OCLConstraint} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OCLConstraintItemProvider oclConstraintItemProvider;

    /**
     * This creates an adapter for a {@link org.scaledl.architecturaltemplates.type.OCLConstraint}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createOCLConstraintAdapter() {
        if (this.oclConstraintItemProvider == null) {
            this.oclConstraintItemProvider = new OCLConstraintItemProvider(this);
        }

        return this.oclConstraintItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.QVTOCompletion} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QVTOCompletionItemProvider qvtoCompletionItemProvider;

    /**
     * This creates an adapter for a {@link org.scaledl.architecturaltemplates.type.QVTOCompletion}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createQVTOCompletionAdapter() {
        if (this.qvtoCompletionItemProvider == null) {
            this.qvtoCompletionItemProvider = new QVTOCompletionItemProvider(this);
        }

        return this.qvtoCompletionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GenericTemplateCompletionParameterItemProvider genericTemplateCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGenericTemplateCompletionParameterAdapter() {
        if (this.genericTemplateCompletionParameterItemProvider == null) {
            this.genericTemplateCompletionParameterItemProvider = new GenericTemplateCompletionParameterItemProvider(
                    this);
        }

        return this.genericTemplateCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GenericBlackboardCompletionParameterItemProvider genericBlackboardCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGenericBlackboardCompletionParameterAdapter() {
        if (this.genericBlackboardCompletionParameterItemProvider == null) {
            this.genericBlackboardCompletionParameterItemProvider = new GenericBlackboardCompletionParameterItemProvider(
                    this);
        }

        return this.genericBlackboardCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMBlackboardCompletionParameterItemProvider pcmBlackboardCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMBlackboardCompletionParameterAdapter() {
        if (this.pcmBlackboardCompletionParameterItemProvider == null) {
            this.pcmBlackboardCompletionParameterItemProvider = new PCMBlackboardCompletionParameterItemProvider(this);
        }

        return this.pcmBlackboardCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMTemplateCompletionParameterItemProvider pcmTemplateCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMTemplateCompletionParameterAdapter() {
        if (this.pcmTemplateCompletionParameterItemProvider == null) {
            this.pcmTemplateCompletionParameterItemProvider = new PCMTemplateCompletionParameterItemProvider(this);
        }

        return this.pcmTemplateCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMOutputCompletionParameterItemProvider pcmOutputCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMOutputCompletionParameterAdapter() {
        if (this.pcmOutputCompletionParameterItemProvider == null) {
            this.pcmOutputCompletionParameterItemProvider = new PCMOutputCompletionParameterItemProvider(this);
        }

        return this.pcmOutputCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GenericOutputCompletionParameterItemProvider genericOutputCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGenericOutputCompletionParameterAdapter() {
        if (this.genericOutputCompletionParameterItemProvider == null) {
            this.genericOutputCompletionParameterItemProvider = new GenericOutputCompletionParameterItemProvider(this);
        }

        return this.genericOutputCompletionParameterItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.atItemProvider != null) {
            this.atItemProvider.dispose();
        }
        if (this.parameterItemProvider != null) {
            this.parameterItemProvider.dispose();
        }
        if (this.repositoryItemProvider != null) {
            this.repositoryItemProvider.dispose();
        }
        if (this.roleItemProvider != null) {
            this.roleItemProvider.dispose();
        }
        if (this.oclConstraintItemProvider != null) {
            this.oclConstraintItemProvider.dispose();
        }
        if (this.qvtoCompletionItemProvider != null) {
            this.qvtoCompletionItemProvider.dispose();
        }
        if (this.genericTemplateCompletionParameterItemProvider != null) {
            this.genericTemplateCompletionParameterItemProvider.dispose();
        }
        if (this.genericBlackboardCompletionParameterItemProvider != null) {
            this.genericBlackboardCompletionParameterItemProvider.dispose();
        }
        if (this.pcmBlackboardCompletionParameterItemProvider != null) {
            this.pcmBlackboardCompletionParameterItemProvider.dispose();
        }
        if (this.pcmTemplateCompletionParameterItemProvider != null) {
            this.pcmTemplateCompletionParameterItemProvider.dispose();
        }
        if (this.pcmOutputCompletionParameterItemProvider != null) {
            this.pcmOutputCompletionParameterItemProvider.dispose();
        }
        if (this.genericOutputCompletionParameterItemProvider != null) {
            this.genericOutputCompletionParameterItemProvider.dispose();
        }
    }

}