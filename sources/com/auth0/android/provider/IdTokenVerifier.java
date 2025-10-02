package com.auth0.android.provider;

import android.text.TextUtils;
import com.auth0.android.request.internal.Jwt;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import io.jsonwebtoken.JwtParser;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/provider/IdTokenVerifier;", "", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdTokenVerifier {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/provider/IdTokenVerifier$Companion;", "", "", "DEFAULT_CLOCK_SKEW", "I", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public static void a(Jwt jwt, IdTokenVerificationOptions idTokenVerificationOptions) {
        Unit unit;
        String strR;
        List list = jwt.o;
        String str = jwt.g;
        String expected = idTokenVerificationOptions.f13662a;
        String expected2 = idTokenVerificationOptions.b;
        SignatureVerifier signatureVerifier = idTokenVerificationOptions.c;
        if (signatureVerifier != null) {
            String tokenAlgorithm = jwt.d;
            List list2 = signatureVerifier.f13669a;
            if (!list2.contains(tokenAlgorithm) || DevicePublicKeyStringDef.NONE.equalsIgnoreCase(tokenAlgorithm)) {
                Intrinsics.h(tokenAlgorithm, "tokenAlgorithm");
                if (list2.size() == 1) {
                    strR = androidx.camera.core.impl.b.r(YU.a.u("Signature algorithm of \"", tokenAlgorithm, "\" is not supported. Expected the ID token to be signed with "), (String) list2.get(0), JwtParser.SEPARATOR_CHAR);
                } else {
                    strR = "Signature algorithm of \"" + tokenAlgorithm + "\" is not supported. Expected the ID token to be signed with any of " + list2 + JwtParser.SEPARATOR_CHAR;
                }
                throw new IdTokenAlgorithmNotSupportedException(strR, 0);
            }
            signatureVerifier.a(jwt.c);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new SignatureVerifierMissingException("Signature Verifier should not be null", 0);
        }
        if (TextUtils.isEmpty(str)) {
            throw new IssClaimMissingException("Issuer (iss) claim must be a string present in the ID token", 0);
        }
        if (!Intrinsics.c(str, expected)) {
            Intrinsics.h(expected, "expected");
            throw new IssClaimMismatchException("Issuer (iss) claim mismatch in the ID token, expected \"" + expected + "\", found \"" + str + '\"', 0);
        }
        if (TextUtils.isEmpty(jwt.f)) {
            throw new SubClaimMissingException("Subject (sub) claim must be a string present in the ID token", 0);
        }
        if (list.isEmpty()) {
            throw new AudClaimMissingException("Audience (aud) claim must be a string or array of strings present in the ID token", 0);
        }
        if (!list.contains(expected2)) {
            Intrinsics.h(expected2, "expected");
            throw new AudClaimMismatchException("Audience (aud) claim mismatch in the ID token; expected \"" + expected2 + "\" but was not one of \"" + list + '\"', 0);
        }
        Calendar calendar = Calendar.getInstance();
        Date time = idTokenVerificationOptions.g;
        if (time == null) {
            time = calendar.getTime();
        }
        Date date = jwt.l;
        if (date == null) {
            throw new ExpClaimMissingException("Expiration Time (exp) claim must be a number present in the ID token", 0);
        }
        calendar.setTime(date);
        calendar.add(13, 60);
        Date time2 = calendar.getTime();
        Intrinsics.e(time);
        if (time.after(time2)) {
            long j = 1000;
            throw new IdTokenExpiredException("Expiration Time (exp) claim error in the ID token; current time (" + (time.getTime() / j) + ") is after expiration time (" + Long.valueOf(time2.getTime() / j) + ')', 0);
        }
        if (jwt.k == null) {
            throw new IatClaimMissingException("Issued At (iat) claim must be a number present in the ID token", 0);
        }
        if (idTokenVerificationOptions.e != null) {
            String str2 = jwt.h;
            if (TextUtils.isEmpty(str2)) {
                throw new NonceClaimMissingException("Nonce (nonce) claim must be a string present in the ID token", 0);
            }
            if (!Intrinsics.c(idTokenVerificationOptions.e, str2)) {
                throw new NonceClaimMismatchException("Nonce (nonce) claim mismatch in the ID token; expected \"" + idTokenVerificationOptions.e + "\", found \"" + str2 + '\"', 0);
            }
        }
        String str3 = idTokenVerificationOptions.d;
        if (str3 != null) {
            if (StringsKt.W(str3, "org_", false)) {
                String str4 = jwt.i;
                if (TextUtils.isEmpty(str4)) {
                    throw new OrgClaimMissingException("Organization Id (org_id) claim must be a string present in the ID token", 0);
                }
                if (!str3.equals(str4)) {
                    throw new OrgClaimMismatchException("Organization Id (org_id) claim mismatch in the ID token; expected \"" + str3 + "\", found \"" + str4 + '\"', 0);
                }
            } else {
                String str5 = jwt.j;
                if (TextUtils.isEmpty(str5)) {
                    throw new OrgNameClaimMissingException("Organization Name (org_name) claim must be a string present in the ID token", 0);
                }
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!lowerCase.equals(str5)) {
                    throw new OrgNameClaimMismatchException("Organization Name (org_name) claim mismatch in the ID token; expected \"" + str3 + "\", found \"" + str5 + '\"', 0);
                }
            }
        }
        if (list.size() > 1) {
            String str6 = jwt.m;
            if (TextUtils.isEmpty(str6)) {
                throw new AzpClaimMissingException("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values", 0);
            }
            if (!Intrinsics.c(expected2, str6)) {
                Intrinsics.h(expected2, "expected");
                throw new AzpClaimMismatchException("Authorized Party (azp) claim mismatch in the ID token; expected \"" + expected2 + "\", found \"" + str6 + '\"', 0);
            }
        }
        if (idTokenVerificationOptions.f != null) {
            Date date2 = jwt.n;
            if (date2 == null) {
                throw new AuthTimeClaimMissingException("Authentication Time (auth_time) claim must be a number present in the ID token when Max Age (max_age) is specified", 0);
            }
            calendar.setTime(date2);
            Integer num = idTokenVerificationOptions.f;
            Intrinsics.e(num);
            calendar.add(13, num.intValue());
            calendar.add(13, 60);
            Date time3 = calendar.getTime();
            if (time.after(time3)) {
                long time4 = time.getTime();
                long j2 = 1000;
                throw new AuthTimeClaimMismatchException("Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (" + (time4 / j2) + ") is after last auth at (" + Long.valueOf(time3.getTime() / j2) + ')', 0);
            }
        }
    }
}
