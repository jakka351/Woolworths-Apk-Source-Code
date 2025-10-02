package org.bouncycastle.jce.provider;

import YU.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TargetInformation;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.PKIXAttrCertChecker;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CertStoreSelector;

/* loaded from: classes8.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = Extension.targetInformation.getId();
    private static final String NO_REV_AVAIL = Extension.noRevAvail.getId();
    private static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTHORITY_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public static void additionalChecks(X509AttributeCertificate x509AttributeCertificate, Set set, Set set2) throws CertPathValidatorException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (x509AttributeCertificate.getAttributes(str) != null) {
                throw new CertPathValidatorException(a.h("Attribute certificate contains prohibited attribute: ", str, "."));
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (x509AttributeCertificate.getAttributes(str2) == null) {
                throw new CertPathValidatorException(a.h("Attribute certificate does not contain necessary attribute: ", str2, "."));
            }
        }
    }

    private static void checkCRL(DistributionPoint distributionPoint, X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) throws NoSuchAlgorithmException, SignatureException, AnnotatedException, InvalidKeyException, RecoverableCertPathValidatorException, CRLException, NoSuchProviderException {
        X509CRL x509crlProcessCRLH;
        if (x509AttributeCertificate.getExtensionValue(X509Extensions.NoRevAvail.getId()) != null) {
            return;
        }
        if (date2.getTime() > date.getTime()) {
            throw new AnnotatedException("Validation time is in future.");
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(new PKIXCertRevocationCheckerParameters(pKIXExtendedParameters, date2, null, -1, x509Certificate, null), distributionPoint, x509AttributeCertificate, pKIXExtendedParameters, date2).iterator();
        boolean z = false;
        AnnotatedException e = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask reasonsMaskProcessCRLD = RFC3280CertPathUtilities.processCRLD(x509crl, distributionPoint);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        PublicKey publicKeyProcessCRLG = RFC3280CertPathUtilities.processCRLG(x509crl, RFC3280CertPathUtilities.processCRLF(x509crl, x509AttributeCertificate, null, null, pKIXExtendedParameters, list, jcaJceHelper));
                        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                            try {
                                x509crlProcessCRLH = RFC3280CertPathUtilities.processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores(), jcaJceHelper), publicKeyProcessCRLG);
                            } catch (AnnotatedException e2) {
                                e = e2;
                            }
                        } else {
                            x509crlProcessCRLH = null;
                        }
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509AttributeCertificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        RFC3280CertPathUtilities.processCRLB1(distributionPoint, x509AttributeCertificate, x509crl);
                        RFC3280CertPathUtilities.processCRLB2(distributionPoint, x509AttributeCertificate, x509crl);
                        RFC3280CertPathUtilities.processCRLC(x509crlProcessCRLH, x509crl, pKIXExtendedParameters);
                        RFC3280CertPathUtilities.processCRLI(date2, x509crlProcessCRLH, x509AttributeCertificate, certStatus, pKIXExtendedParameters);
                        RFC3280CertPathUtilities.processCRLJ(date2, x509crl, x509AttributeCertificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        z = true;
                    } catch (AnnotatedException e3) {
                        e = e3;
                    }
                } else {
                    continue;
                }
            } catch (AnnotatedException e4) {
                e = e4;
            }
        }
        if (!z) {
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCRLs(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, List list, JcaJceHelper jcaJceHelper) throws NoSuchAlgorithmException, SignatureException, AnnotatedException, InvalidKeyException, CertPathValidatorException, CRLException, NoSuchProviderException {
        boolean z;
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2;
        X509AttributeCertificate x509AttributeCertificate2 = x509AttributeCertificate;
        if (pKIXExtendedParameters.isRevocationEnabled()) {
            if (x509AttributeCertificate2.getExtensionValue(NO_REV_AVAIL) != null) {
                if (x509AttributeCertificate2.getExtensionValue(CRL_DISTRIBUTION_POINTS) != null || x509AttributeCertificate2.getExtensionValue(AUTHORITY_INFO_ACCESS) != null) {
                    throw new CertPathValidatorException("No rev avail extension is set, but also an AC revocation pointer.");
                }
                return;
            }
            try {
                CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509AttributeCertificate2, CRL_DISTRIBUTION_POINTS));
                ArrayList arrayList = new ArrayList();
                try {
                    Date date3 = date2;
                    JcaJceHelper jcaJceHelper2 = jcaJceHelper;
                    arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap(), date3, jcaJceHelper2));
                    PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        builder.addCRLStore((PKIXCRLStore) arrayList);
                    }
                    PKIXExtendedParameters pKIXExtendedParametersBuild = builder.build();
                    CertStatus certStatus = new CertStatus();
                    ReasonsMask reasonsMask = new ReasonsMask();
                    boolean z2 = true;
                    if (cRLDistPoint != null) {
                        try {
                            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                            int i = 0;
                            boolean z3 = false;
                            while (i < distributionPoints.length && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
                                try {
                                    DistributionPoint[] distributionPointArr = distributionPoints;
                                    int i2 = i;
                                    checkCRL(distributionPointArr[i], x509AttributeCertificate2, (PKIXExtendedParameters) pKIXExtendedParametersBuild.clone(), date, date3, x509Certificate, certStatus, reasonsMask, list, jcaJceHelper2);
                                    i = i2 + 1;
                                    x509AttributeCertificate2 = x509AttributeCertificate;
                                    date3 = date2;
                                    jcaJceHelper2 = jcaJceHelper;
                                    z3 = true;
                                    distributionPoints = distributionPointArr;
                                } catch (AnnotatedException e) {
                                    z = z3;
                                    annotatedException = new AnnotatedException("No valid CRL for distribution point found.", e);
                                }
                            }
                            z = z3;
                        } catch (Exception e2) {
                            throw new ExtCertPathValidatorException("Distribution points could not be read.", e2);
                        }
                    } else {
                        z = false;
                    }
                    annotatedException = null;
                    if (certStatus.getCertStatus() == 11) {
                        try {
                            if (!reasonsMask.isAllReasons()) {
                                try {
                                    checkCRL(new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, PrincipalUtils.getEncodedIssuerPrincipal(x509AttributeCertificate)))), null, null), x509AttributeCertificate, (PKIXExtendedParameters) pKIXExtendedParametersBuild.clone(), date, date2, x509Certificate, certStatus, reasonsMask, list, jcaJceHelper);
                                    annotatedException2 = annotatedException;
                                } catch (Exception e3) {
                                    throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e3);
                                }
                            }
                            annotatedException2 = annotatedException;
                        } catch (AnnotatedException e4) {
                            annotatedException2 = new AnnotatedException("No valid CRL for distribution point found.", e4);
                        }
                        z2 = z;
                    } else {
                        annotatedException2 = annotatedException;
                        z2 = z;
                    }
                    if (!z2) {
                        throw new ExtCertPathValidatorException("No valid CRL found.", annotatedException2);
                    }
                    if (certStatus.getCertStatus() != 11) {
                        StringBuilder sbT = a.t("Attribute certificate revocation after " + certStatus.getRevocationDate(), ", reason: ");
                        sbT.append(RFC3280CertPathUtilities.crlReasons[certStatus.getCertStatus()]);
                        throw new CertPathValidatorException(sbT.toString());
                    }
                    if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == 11) {
                        certStatus.setCertStatus(12);
                    }
                    if (certStatus.getCertStatus() == 12) {
                        throw new CertPathValidatorException("Attribute certificate status could not be determined.");
                    }
                } catch (AnnotatedException e5) {
                    throw new CertPathValidatorException("No additional CRL locations could be decoded from CRL distribution point extension.", e5);
                }
            } catch (AnnotatedException e6) {
                throw new CertPathValidatorException("CRL distribution point extension could not be read.", e6);
            }
        }
    }

    public static CertPath processAttrCert1(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathBuilderException, NoSuchAlgorithmException, IOException, CertPathValidatorException, NoSuchProviderException, InvalidAlgorithmParameterException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (x509AttributeCertificate.getHolder().getIssuer() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(x509AttributeCertificate.getHolder().getSerialNumber());
            for (Principal principal : x509AttributeCertificate.getHolder().getIssuer()) {
                try {
                    if (principal instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) principal).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new PKIXCertStoreSelector.Builder(x509CertSelector).build(), pKIXExtendedParameters.getCertStores());
                } catch (IOException e) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e);
                } catch (AnnotatedException e2) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e2);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (x509AttributeCertificate.getHolder().getEntityNames() != null) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            for (Principal principal2 : x509AttributeCertificate.getHolder().getEntityNames()) {
                try {
                    if (principal2 instanceof X500Principal) {
                        x509CertStoreSelector.setIssuer(((X500Principal) principal2).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build(), pKIXExtendedParameters.getCertStores());
                } catch (IOException e3) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e3);
                } catch (AnnotatedException e4) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e4);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
        Iterator it = linkedHashSet.iterator();
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResultBuild = null;
        while (it.hasNext()) {
            X509CertStoreSelector x509CertStoreSelector2 = new X509CertStoreSelector();
            x509CertStoreSelector2.setCertificate((X509Certificate) it.next());
            builder.setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertStoreSelector2).build());
            try {
                try {
                    certPathBuilderResultBuild = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new PKIXExtendedBuilderParameters.Builder(builder.build()).build());
                } catch (InvalidAlgorithmParameterException e5) {
                    throw new RuntimeException(e5.getMessage());
                } catch (CertPathBuilderException e6) {
                    extCertPathValidatorException = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", e6);
                }
            } catch (NoSuchAlgorithmException e7) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e7);
            } catch (NoSuchProviderException e8) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e8);
            }
        }
        if (extCertPathValidatorException == null) {
            return certPathBuilderResultBuild.getCertPath();
        }
        throw extCertPathValidatorException;
    }

    public static CertPathValidatorResult processAttrCert2(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, pKIXExtendedParameters);
            } catch (InvalidAlgorithmParameterException e) {
                throw new RuntimeException(e.getMessage());
            } catch (CertPathValidatorException e2) {
                throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e3);
        } catch (NoSuchProviderException e4) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e4);
        }
    }

    public static void processAttrCert3(X509Certificate x509Certificate, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && ((keyUsage.length <= 0 || !keyUsage[0]) && (keyUsage.length <= 1 || !keyUsage[1]))) {
            throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
        }
        if (x509Certificate.getBasicConstraints() != -1) {
            throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
        }
    }

    public static void processAttrCert4(X509Certificate x509Certificate, Set set) throws CertPathValidatorException {
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z = true;
            }
        }
        if (!z) {
            throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
        }
    }

    public static void processAttrCert5(X509AttributeCertificate x509AttributeCertificate, Date date) throws CertPathValidatorException {
        try {
            x509AttributeCertificate.checkValidity(date);
        } catch (CertificateExpiredException e) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e);
        } catch (CertificateNotYetValidException e2) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e2);
        }
    }

    public static void processAttrCert7(X509AttributeCertificate x509AttributeCertificate, CertPath certPath, CertPath certPath2, PKIXExtendedParameters pKIXExtendedParameters, Set set) throws CertPathValidatorException {
        Set<String> criticalExtensionOIDs = x509AttributeCertificate.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                TargetInformation.getInstance(CertPathValidatorUtilities.getExtensionValue(x509AttributeCertificate, str));
            } catch (IllegalArgumentException e) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e);
            } catch (AnnotatedException e2) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e2);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((PKIXAttrCertChecker) it.next()).check(x509AttributeCertificate, certPath, certPath2, criticalExtensionOIDs);
        }
        if (criticalExtensionOIDs.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
    }
}
