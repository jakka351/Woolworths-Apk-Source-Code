package com.cisco.or.sdk.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.services.Service;
import com.cisco.or.sdk.utils.SharedPrefs;
import com.cisco.or.sdk.utils.Urls;
import com.salesforce.marketingcloud.storage.db.k;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.UUID;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/RegisterService;", "Lcom/cisco/or/sdk/services/Service;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RegisterService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final RegisterService f14049a = new RegisterService();

    @Override // com.cisco.or.sdk.services.Service
    public final void c(Context context, ArrayList arrayList, DNASpacesBackgroundExceptionHandler exceptionHandler, Function1 function1) throws JSONException {
        Intrinsics.h(context, "context");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        String strConcat = Urls.a(context).concat("/sdk/v1/register");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("guid", UUID.randomUUID().toString());
        jSONObject.put("appId", new SharedPrefs(context).f14054a.getString("APP_ID", null));
        jSONObject.put(k.a.b, "android");
        Service.b(context, new Service.RequestData(strConcat, arrayList, Service.HTTP_METHOD.f, jSONObject.toString()), Service.RESPONSE_FORMATTER.e, exceptionHandler, function1);
    }

    @Override // com.cisco.or.sdk.services.Service
    public final void d(Context context, DNASpacesBackgroundExceptionHandler exceptionHandler, Function1 function1) {
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        SharedPreferences sharedPreferences = new SharedPrefs(context).f14054a;
        String string = sharedPreferences.getString("PREF_CLIENT_PUBLIC_KEY", null);
        if (string == null || string.length() == 0) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            Intrinsics.g(keyPairGenKeyPair, "kpg.genKeyPair()");
            sharedPreferences.edit().putString("PREF_CLIENT_PUBLIC_KEY", Base64.encodeToString(keyPairGenKeyPair.getPublic().getEncoded(), 1)).apply();
            c.v(sharedPreferences, "PREF_CLIENT_PRIVATE_KEY", Base64.encodeToString(keyPairGenKeyPair.getPrivate().getEncoded(), 1));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Service.HeaderParam(RequestBuilder.CONTENT_TYPE, "application/json"));
        String string2 = new SharedPrefs(context).f14054a.getString("PREF_DNA_SPACES_KEY", null);
        Intrinsics.e(string2);
        arrayList.add(new Service.HeaderParam("x-dnaspaces-apikey", string2));
        String string3 = sharedPreferences.getString("PREF_CLIENT_PUBLIC_KEY", null);
        Intrinsics.e(string3);
        Cipher cipher = Cipher.getInstance("RSA");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAoWaxMIW/EZ248Dd8SmyRHNF7/ZhEcoyGDqQ9+OWNR/n2u74Gzay0gu3MbhewK7JHM0ecXBjUuA90C3rzsbouh7wXuAy+ECUOnuiItyIpYpaEp6ZKRKWwoXKapB2ZbFqeUe2kEHa7SucCRpFpLPKUio7ilphYhUBFel73v+WwEzD4VIuNCI4bnzGJsJ0b9e7h868mlF6nXlygLfM648pXCtsui8nK8wdQTRjsv+4tLvRXGgqnZbJ4H1uUrWDxlBJfrYR+0ZLjNAG03Lau875lS9ux1eG/kNttKFSO0lHU2biqPcTPqDrupMqfCerY3gtUChkEYthv7ulBxNUtFcgaKroroNoRq/jJt5tfTT/S2nMiyhrtNJp+ba6Y4PdBpmu/GmbXwXXr4UM7mORWmdHo0FivIl/8WEF5F5C/f+E9TYIKGqil2AlWpcsQ3GlYjSX4w2nbDeRCjG352B2ZrDzl5rRDIJyV7TIZxt35s56pdAj2Sgxl95K0SQBUIxr6fvwdAgMBAAE=", 0)));
        Intrinsics.g(publicKeyGeneratePublic, "keyFactory.generatePublic(spec)");
        cipher.init(1, publicKeyGeneratePublic);
        PublicKey publicKeyGeneratePublic2 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string3, 0)));
        Intrinsics.g(publicKeyGeneratePublic2, "keyFactory.generatePublic(spec)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(publicKeyGeneratePublic2.getEncoded()), 2);
        Intrinsics.g(strEncodeToString, "encodeToString(encryptedBytes, Base64.NO_WRAP)");
        arrayList.add(new Service.HeaderParam("Authorization", strEncodeToString));
        c(context, arrayList, exceptionHandler, function1);
    }
}
