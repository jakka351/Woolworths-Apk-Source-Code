package org.bouncycastle.jce.provider;

import androidx.constraintlayout.core.state.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: classes8.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        if (x509Certificate instanceof BCX509Certificate) {
            try {
            } catch (RuntimeException e) {
                e = e;
            }
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException("unable to process TBSCertificate", e);
        }
        try {
            TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e2) {
            throw new AnnotatedException(e2.getMessage());
        } catch (CertificateEncodingException e3) {
            throw new AnnotatedException("unable to process TBSCertificate", e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertificateNotYetValidException, CertPathValidatorException, CertificateExpiredException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        List<? extends Certificate> list;
        X500Name ca;
        PublicKey cAPublicKey;
        int i;
        TrustAnchor trustAnchor;
        ProvCrlRevocationChecker provCrlRevocationChecker;
        HashSet hashSet;
        int i2;
        List list2;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            baseParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            baseParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException(a.f(PKIXParameters.class, new StringBuilder("Parameters must be a "), " instance."));
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        int algorithmIdentifier = -1;
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(baseParameters, new Date());
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor == null) {
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                } catch (AnnotatedException e) {
                    e = e;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - 1);
                }
            }
            checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
            PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
            int i3 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                arrayListArr[i4] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i5 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i3;
            int i6 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i3;
            if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                i3 = 0;
            }
            X509Certificate trustedCert = trustAnchorFindTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca = PrincipalUtils.getCA(trustAnchorFindTrustAnchor);
                    cAPublicKey = trustAnchorFindTrustAnchor.getCAPublicKey();
                }
                try {
                    algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                    if (pKIXExtendedParametersBuild.getTargetConstraints() != null) {
                        i = 1;
                        if (!pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                    } else {
                        i = 1;
                    }
                    List certPathCheckers = pKIXExtendedParametersBuild.getCertPathCheckers();
                    Iterator it = certPathCheckers.iterator();
                    while (it.hasNext()) {
                        ((PKIXCertPathChecker) it.next()).init(false);
                    }
                    if (pKIXExtendedParametersBuild.isRevocationEnabled()) {
                        provCrlRevocationChecker = new ProvCrlRevocationChecker(this.helper);
                        trustAnchor = trustAnchorFindTrustAnchor;
                    } else {
                        trustAnchor = trustAnchorFindTrustAnchor;
                        provCrlRevocationChecker = null;
                    }
                    int i7 = i3;
                    int size2 = certificates.size() - 1;
                    int i8 = i5;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i9 = i8;
                    PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                    X509Certificate x509Certificate = null;
                    int i10 = size;
                    while (size2 >= 0) {
                        int i11 = size - size2;
                        List<? extends Certificate> list3 = certificates;
                        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                        boolean z = size2 == list3.size() + (-1) ? i : 0;
                        try {
                            checkCertificate(x509Certificate2);
                            X509Certificate x509Certificate3 = trustedCert;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            PublicKey publicKey = cAPublicKey;
                            int i12 = i10;
                            int i13 = i9;
                            X500Name x500Name = ca;
                            List list4 = certPathCheckers;
                            PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                            TrustAnchor trustAnchor2 = trustAnchor;
                            Date date = validityDate;
                            PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParameters;
                            RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters2, date, provCrlRevocationChecker, size2, publicKey, z, x500Name, x509Certificate3);
                            pKIXExtendedParameters = pKIXExtendedParameters2;
                            int i14 = size2;
                            ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                            RFC3280CertPathUtilities.processCertBC(certPath, i14, pKIXNameConstraintValidator2, this.isForCRLCheck);
                            HashSet hashSet5 = hashSet4;
                            int iPrepareNextCertJ = i6;
                            PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath, i14, RFC3280CertPathUtilities.processCertD(certPath, i14, hashSet5, pKIXPolicyNode2, arrayListArr2, iPrepareNextCertJ, this.isForCRLCheck));
                            RFC3280CertPathUtilities.processCertF(certPath, i14, pKIXPolicyNodeProcessCertE, i13);
                            if (i11 != size) {
                                if (x509Certificate2 != null) {
                                    hashSet4 = hashSet5;
                                    int i15 = i;
                                    if (x509Certificate2.getVersion() == i15) {
                                        if (i11 != i15 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                            throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i14);
                                        }
                                    }
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                RFC3280CertPathUtilities.prepareNextCertA(certPath, i14);
                                PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i14, arrayListArr2, pKIXPolicyNodeProcessCertE, i7);
                                RFC3280CertPathUtilities.prepareNextCertG(certPath, i14, pKIXNameConstraintValidator2);
                                int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i14, i13);
                                int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i14, i7);
                                int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i14, iPrepareNextCertJ);
                                int iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i14, iPrepareNextCertH1);
                                int iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i14, iPrepareNextCertH2);
                                iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i14, iPrepareNextCertH3);
                                RFC3280CertPathUtilities.prepareNextCertK(certPath, i14);
                                int iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i14, RFC3280CertPathUtilities.prepareNextCertL(certPath, i14, i12));
                                RFC3280CertPathUtilities.prepareNextCertN(certPath, i14);
                                Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs != null) {
                                    hashSet2 = new HashSet(criticalExtensionOIDs);
                                    hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                    hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                    hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                    hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                    hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                    hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                    hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                    hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                    hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                } else {
                                    hashSet2 = new HashSet();
                                }
                                RFC3280CertPathUtilities.prepareNextCertO(certPath, i14, hashSet2, list4);
                                X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                try {
                                    PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i14, this.helper);
                                    AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier2.getAlgorithm();
                                    algorithmIdentifier2.getParameters();
                                    cAPublicKey = nextWorkingKey;
                                    list2 = list4;
                                    trustedCert = x509Certificate2;
                                    ca = subjectPrincipal;
                                    i2 = iPrepareNextCertM;
                                    i13 = iPrepareNextCertI1;
                                    i7 = iPrepareNextCertI2;
                                    i6 = iPrepareNextCertJ;
                                    int i16 = i14 - 1;
                                    arrayListArr = arrayListArr2;
                                    validityDate = date;
                                    provCrlRevocationChecker = provCrlRevocationChecker2;
                                    i9 = i13;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    i = 1;
                                    size2 = i16;
                                    certPathCheckers = list2;
                                    i10 = i2;
                                    x509Certificate = x509Certificate2;
                                    trustAnchor = trustAnchor2;
                                    certificates = list3;
                                } catch (CertPathValidatorException e2) {
                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath, i14);
                                }
                            } else {
                                hashSet4 = hashSet5;
                            }
                            list2 = list4;
                            i2 = i12;
                            pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                            cAPublicKey = publicKey;
                            ca = x500Name;
                            trustedCert = x509Certificate3;
                            i6 = iPrepareNextCertJ;
                            int i162 = i14 - 1;
                            arrayListArr = arrayListArr2;
                            validityDate = date;
                            provCrlRevocationChecker = provCrlRevocationChecker2;
                            i9 = i13;
                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                            i = 1;
                            size2 = i162;
                            certPathCheckers = list2;
                            i10 = i2;
                            x509Certificate = x509Certificate2;
                            trustAnchor = trustAnchor2;
                            certificates = list3;
                        } catch (AnnotatedException e3) {
                            throw new CertPathValidatorException(e3.getMessage(), e3.getUnderlyingException(), certPath, size2);
                        }
                    }
                    TrustAnchor trustAnchor3 = trustAnchor;
                    int i17 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    List list5 = certPathCheckers;
                    int i18 = i17 + 1;
                    int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i18, RFC3280CertPathUtilities.wrapupCertA(i9, x509Certificate));
                    Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i18, list5, hashSet);
                    PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters, initialPolicies, i18, arrayListArr3, pKIXPolicyNode2, hashSet4);
                    if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor3, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i17);
                } catch (CertPathValidatorException e4) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath, -1);
                }
            } catch (RuntimeException e5) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e5, certPath, algorithmIdentifier);
            }
        } catch (AnnotatedException e6) {
            e = e6;
            list = certificates;
        }
    }

    public PKIXCertPathValidatorSpi(boolean z) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z;
    }
}
