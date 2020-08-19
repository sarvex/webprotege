package edu.stanford.bmir.protege.web.server.index;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import edu.stanford.bmir.protege.web.server.index.impl.*;
import edu.stanford.bmir.protege.web.server.owlapi.ProjectAnnotationAssertionAxiomsBySubjectIndexImpl;
import edu.stanford.bmir.protege.web.server.project.DefaultOntologyIdManager;
import edu.stanford.bmir.protege.web.server.project.DefaultOntologyIdManagerImpl;
import edu.stanford.bmir.protege.web.server.revision.RevisionManager;
import edu.stanford.bmir.protege.web.server.shortform.DeprecatedEntitiesByEntityIndexLuceneImpl;
import edu.stanford.bmir.protege.web.shared.inject.ProjectSingleton;
import edu.stanford.owl2lpg.client.read.axiom.AssertionAxiomBySubjectAccessorModule;
import edu.stanford.owl2lpg.client.read.axiom.AxiomBySubjectAccessorModule;
import edu.stanford.owl2lpg.client.read.axiom.HierarchyAxiomBySubjectAccessorModule;
import edu.stanford.owl2lpg.client.read.index.Neo4jAnnotationAssertionAxiomsBySubjectIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jClassAssertionAxiomsByIndividualIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jClassFrameAxiomsIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jDataPropertyAssertionAxiomsBySubjectIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jNamedIndividualFrameAxiomsIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jObjectPropertyAssertionAxiomsBySubjectIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jPropertyAssertionAxiomsBySubjectIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jSubClassOfAxiomsBySubClassIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jSubDataPropertyAxiomsBySubPropertyIndex;
import edu.stanford.owl2lpg.client.read.index.Neo4jSubObjectPropertyAxiomsBySubPropertyIndex;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-09-10
 */
@Module(includes = {
    AxiomBySubjectAccessorModule.class,
    HierarchyAxiomBySubjectAccessorModule.class,
    AssertionAxiomBySubjectAccessorModule.class
})
public class Neo4jIndexModule {

    @Provides
    ClassFrameAxiomsIndex provideClassFrameAxiomsIndex(Neo4jClassFrameAxiomsIndex impl) {
        return impl;
    }

    @Provides
    NamedIndividualFrameAxiomIndex provideNamedIndividualFrameAxiomIndex(Neo4jNamedIndividualFrameAxiomsIndex impl) {
        return impl;
    }

    @Provides
    AnnotationAssertionAxiomsBySubjectIndex provideAnnotationAssertionAxiomsBySubjectIndex(
        Neo4jAnnotationAssertionAxiomsBySubjectIndex impl) {
        return impl;
    }

    @Provides
    AnnotationAssertionAxiomsIndex provideAnnotationAssertionAxiomsIndex(AnnotationAssertionAxiomsIndexWrapperImpl impl) {
        return impl;
    }

    @Provides
    AnnotationPropertyDomainAxiomsIndex provideAnnotationPropertyDomainAxiomsIndex(
        AnnotationPropertyDomainAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    AnnotationPropertyRangeAxiomsIndex provideAnnotationPropertyRangeAxiomsIndex(AnnotationPropertyRangeAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    AxiomsByEntityReferenceIndex provideAxiomsByEntityReferenceIndex(AxiomsByEntityReferenceIndexImpl impl) {
        return impl;
    }

    @Provides
    AnnotationAxiomsByIriReferenceIndex provideAxiomsByIriReferenceIndex(AnnotationAxiomsByIriReferenceIndexImpl impl) {
        return impl;
    }

    @Provides
    AxiomsByReferenceIndex provideAxiomsByReferenceIndex(AxiomsByReferenceIndexImpl impl) {
        return impl;
    }

    @Provides
    AxiomsByTypeIndex provideAxiomsByTypeIndex(AxiomsByTypeIndexImpl impl) {
        return impl;
    }

    @Provides
    @ProjectSingleton
    public ClassAssertionAxiomsByClassIndex provideClassAssertionAxiomsByClassIndex(ClassAssertionAxiomsByClassIndexImpl impl) {
        return impl;
    }

    @Provides
    ClassAssertionAxiomsByIndividualIndex provideClassAssertionAxiomsByIndividualIndex(
        Neo4jClassAssertionAxiomsByIndividualIndex impl) {
        return impl;
    }

    @Provides
    DataPropertyAssertionAxiomsBySubjectIndex provideDataPropertyAssertionAxiomsBySubjectIndex(
        Neo4jDataPropertyAssertionAxiomsBySubjectIndex impl) {
        return impl;
    }

    @Provides
    DataPropertyCharacteristicsIndex provideDataPropertyCharacteristicsIndex(DataPropertyCharacteristicsIndexImpl impl) {
        return impl;
    }

    @Provides
    DataPropertyDomainAxiomsIndex provideDataPropertyDomainAxiomsIndex(DataPropertyDomainAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    DataPropertyRangeAxiomsIndex provideDataPropertyRangeAxiomsIndex(DataPropertyRangeAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    DefaultOntologyIdManager provideDefaultOntologyIdManager(DefaultOntologyIdManagerImpl impl) {
        return impl;
    }

    @Provides
    DeprecatedEntitiesByEntityIndex provideDeprecatedEntitiesByEntityIndex(DeprecatedEntitiesByEntityIndexLuceneImpl impl) {
        return impl;
    }

    @Provides
    DifferentIndividualsAxiomsIndex provideDifferentIndividualsAxiomsIndex(DifferentIndividualsAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    DisjointClassesAxiomsIndex provideDisjointClassesAxiomsIndex(DisjointClassesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    DisjointDataPropertiesAxiomsIndex provideDisjointDataPropertiesAxiomsIndex(DisjointDataPropertiesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    DisjointObjectPropertiesAxiomsIndex provideDisjointObjectPropertiesAxiomsIndex(
        DisjointObjectPropertiesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    EntitiesInOntologySignatureByIriIndex provideEntitiesInOntologySignatureByIriIndex(
        EntitiesInOntologySignatureByIriIndexImpl impl) {
        return impl;
    }

    @Provides
    EntitiesInOntologySignatureIndex provideEntitiesInOntologySignatureIndex(EntitiesInOntologySignatureIndexImpl impl) {
        return impl;
    }

    @Provides
    EntitiesInProjectSignatureByIriIndex provideEntitiesInProjectSignatureByIriIndex(
        EntitiesInProjectSignatureByIriIndexImpl impl) {
        return impl;
    }

    @Provides
    EntitiesInProjectSignatureIndex provideEntitiesInProjectSignatureIndexImpl(EntitiesInProjectSignatureIndexImpl impl) {
        return impl;
    }

    @Provides
    EquivalentClassesAxiomsIndex provideEquivalentClassesAxiomsIndex(EquivalentClassesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    EquivalentDataPropertiesAxiomsIndex provideEquivalentDataPropertiesAxiomsIndex(
        EquivalentDataPropertiesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    EquivalentObjectPropertiesAxiomsIndex provideEquivalentObjectPropertiesAxiomsIndex(
        EquivalentObjectPropertiesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    IndividualsByTypeIndex provideIndividualsByTypeIndex(IndividualsByTypeIndexImpl impl) {
        return impl;
    }

    @Provides
    @ProjectSingleton
    IndividualsIndex provideIndividualsIndex(IndividualsIndexImpl impl) {
        return impl;
    }

    @Provides
    InverseObjectPropertyAxiomsIndex provideInverseObjectPropertyAxiomsIndex(InverseObjectPropertyAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    ObjectPropertyAssertionAxiomsBySubjectIndex provideObjectPropertyAssertionAxiomsBySubjectIndex(
        Neo4jObjectPropertyAssertionAxiomsBySubjectIndex impl) {
        return impl;
    }

    @Provides
    ObjectPropertyCharacteristicsIndex provideObjectPropertyCharacteristicsIndex(ObjectPropertyCharacteristicsIndexImpl impl) {
        return impl;
    }

    @Provides
    ObjectPropertyDomainAxiomsIndex provideObjectPropertyDomainAxiomsIndex(ObjectPropertyDomainAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    ObjectPropertyRangeAxiomsIndex provideObjectPropertyRangeAxiomsIndex(ObjectPropertyRangeAxiomsIndexImpl impl) {
        return impl;
    }

    @ProjectSingleton
    @Provides
    OntologyAnnotationsIndex provideOntologyAnnotationsIndex(OntologyAnnotationsIndexImpl impl) {
        return impl;
    }

    @Provides
    OntologyAnnotationsSignatureIndex provideOntologyAnnotationsSignatureIndex(@Nonnull OntologyAnnotationsIndexImpl impl) {
        return impl;
    }

    @Provides
    OntologyAxiomsIndex provideOntologyAxiomsIndex(OntologyAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    OntologyAxiomsSignatureIndex provideOntologyAxiomsSignatureIndex(AxiomsByEntityReferenceIndexImpl impl) {
        return impl;
    }

    @Provides
    OntologySignatureByTypeIndex provideOntologySignatureByTypeIndex(OntologySignatureByTypeIndexImpl impl) {
        return impl;
    }

    @Provides
    OntologySignatureIndex provideOntologySignatureIndex(OntologySignatureIndexImpl impl) {
        return impl;
    }

    @Provides
    ProjectClassAssertionAxiomsByIndividualIndex provideProjectClassAssertionAxiomsByIndividualIndex(
        ProjectClassAssertionAxiomsByIndividualIndexImpl impl) {
        return impl;
    }

    @Provides
    ProjectOntologiesIndex provideProjectOntologiesIndex(ProjectOntologiesIndexImpl impl,
                                                         RevisionManager revisionManager) {
        impl.init(revisionManager);
        return impl;
    }

    @Provides
    ProjectSignatureByTypeIndex provideProjectSignatureByTypeIndex(ProjectSignatureByTypeIndexImpl impl) {
        return impl;
    }

    @Provides
    ProjectSignatureIndex provideProjectSignatureIndex(ProjectSignatureIndexImpl impl) {
        return impl;
    }

    @Provides
    PropertyAssertionAxiomsBySubjectIndex providePropertyAssertionAxiomsBySubjectIndex(
        Neo4jPropertyAssertionAxiomsBySubjectIndex impl) {
        return impl;
    }

    @Provides
    SameIndividualAxiomsIndex provideSameIndividualAxiomsIndex(SameIndividualAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    SubAnnotationPropertyAxiomsBySubPropertyIndex provideSubAnnotationPropertyAxiomsBySubPropertyIndex(
        SubAnnotationPropertyAxiomsBySubPropertyIndexImpl impl) {
        return impl;
    }

    @Provides
    SubAnnotationPropertyAxiomsBySuperPropertyIndex provideSubAnnotationPropertyAxiomsBySuperPropertyIndex(
        SubAnnotationPropertyAxiomsBySuperPropertyIndexImpl impl) {
        return impl;
    }

    @Provides
    SubClassOfAxiomsBySubClassIndex provideSubClassOfAxiomsBySubClassIndex(Neo4jSubClassOfAxiomsBySubClassIndex impl) {
        return impl;
    }

    @Provides
    SubDataPropertyAxiomsBySubPropertyIndex provideSubDataPropertyAxiomsBySubPropertyIndex(
        Neo4jSubDataPropertyAxiomsBySubPropertyIndex impl) {
        return impl;
    }

    @Provides
    SubObjectPropertyAxiomsBySubPropertyIndex provideSubObjectPropertyAxiomsBySubPropertyIndex(
        Neo4jSubObjectPropertyAxiomsBySubPropertyIndex impl) {
        return impl;
    }

    @Provides
    ProjectAnnotationAssertionAxiomsBySubjectIndex providesHasAnnotationAssertionAxioms(
        ProjectAnnotationAssertionAxiomsBySubjectIndexImpl impl) {
        return impl;
    }

    @Provides
    @ProjectSingleton
    public AnnotationAssertionAxiomsByValueIndex provideAnnotationAssertionAxiomsByValueIndex(AnnotationAssertionAxiomsByValueIndexImpl impl) {
        return impl;
    }


    @Provides
    @IntoSet
    public UpdatableIndex provideAnnotationAssertionAxiomsBySubjectIndexImplIntoSet(AnnotationAssertionAxiomsBySubjectIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideAnnotationAxiomsByIriReferenceIndexImplIntoSet(AnnotationAxiomsByIriReferenceIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideAxiomsByEntityReferenceIndexImplIntoSet(AxiomsByEntityReferenceIndexImpl impl) {
        return impl;
    }



    @Provides
    @IntoSet
    public UpdatableIndex provideAnnotationAssertionAxiomsByValueIndexIntoSet(AnnotationAssertionAxiomsByValueIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideAxiomsByTypeIndexImplIntoSet(AxiomsByTypeIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideClassAssertionAxiomsByClassIndexImplIntoSet(ClassAssertionAxiomsByClassIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideClassAssertionAxiomsByIndividualIndexImplIntoSet(ClassAssertionAxiomsByIndividualIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideDataPropertyAssertionAxiomsBySubjectIndexImplIntoSet(DataPropertyAssertionAxiomsBySubjectIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideDifferentIndividualsAxiomsIndexImplIntoSet(DifferentIndividualsAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideDisjointClassesAxiomsIndexImplIntoSet(DisjointClassesAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideObjectPropertyAssertionAxiomsBySubjectIndexImplIntoSet(ObjectPropertyAssertionAxiomsBySubjectIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideOntologyAnnotationsIndexImplIntoSet(OntologyAnnotationsIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideSameIndividualAxiomsIndexImplIntoSet(SameIndividualAxiomsIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideSubAnnotationPropertyAxiomsBySuperPropertyIndexImplIntoSet(SubAnnotationPropertyAxiomsBySuperPropertyIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideSubClassOfAxiomsBySubClassIndexImplIntoSet(SubClassOfAxiomsBySubClassIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    public UpdatableIndex provideEquivalentClassesAxiomsIndexIntoSet(EquivalentClassesAxiomsIndexImpl impl) {
        return impl;
    }

    @ProjectSingleton
    @Provides
    IndexUpdater provideIndexUpdater(IndexUpdaterFactory factory) {
        var updater = factory.create();
        updater.buildIndexes();
        return updater;
    }

    @ProjectSingleton
    @Provides
    RootIndex provideRootIndex(RootIndexImpl impl) {
        return impl;
    }

    @Provides
    @IntoSet
    UpdatableIndex provideProjectOntologiesIndexIntoSet(ProjectOntologiesIndexImpl impl) {
        return impl;
    }

    @Provides
    @ProjectSingleton
    public BuiltInOwlEntitiesIndex provideBuiltInOwlEntitiesIndex(@Nonnull BuiltInOwlEntitiesIndexImpl impl) {
        return impl;
    }

    @Provides
    @ProjectSingleton
    public BuiltInSkosEntitiesIndex provideBuiltInSkosEntitiesIndex(@Nonnull BuiltInSkosEntitiesIndexImpl impl) {
        return impl;
    }

    @Provides
    @ProjectSingleton
    public DeprecatedEntitiesIndex provideDeprecatedEntitiesIndex(@Nonnull DeprecatedEntitiesIndexLuceneImpl impl) {
        return impl;
    }
}
