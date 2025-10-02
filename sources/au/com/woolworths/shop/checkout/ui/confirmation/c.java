package au.com.woolworths.shop.checkout.ui.confirmation;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.measurement.internal.zzic;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.CodedOutputStream;
import io.branch.referral.BranchLogger;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static int A(int i, int i2, int i3) {
        return zzlm.zzz(i) + i2 + i3;
    }

    public static int B(int i, int i2, int i3, int i4) {
        return CodedOutputStream.W(i) + i2 + i3 + i4;
    }

    public static void C(zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    public static int D(int i, int i2, int i3) {
        return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Z(i) + i2 + i3;
    }

    public static int a(int i, int i2) {
        return String.valueOf(i).length() + i2;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int e(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static int f(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static Bundle g(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static FieldDescriptor h(AtProtobuf atProtobuf, FieldDescriptor.Builder builder) {
        builder.b(atProtobuf.a());
        return builder.a();
    }

    public static Object i(zzbk zzbkVar, int i, List list, int i2) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i2);
    }

    public static String j(int i, int i2, int i3, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    public static String k(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String l(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String n(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String o(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static StringBuilder p(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static StringBuilder q(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    public static StringBuilder r(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static Map s(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static KProperty1 t(Class cls, String str, String str2, int i, ReflectionFactory reflectionFactory) {
        return reflectionFactory.h(new PropertyReference1Impl(cls, str, str2, i));
    }

    public static ASN1ObjectIdentifier u(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static void v(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public static void w(zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static void x(Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder, NetworkRequestMetricBuilder networkRequestMetricBuilder2) {
        networkRequestMetricBuilder.i(timer.a());
        NetworkRequestMetricBuilderUtil.c(networkRequestMetricBuilder2);
    }

    public static void y(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    public static void z(JSONException jSONException, StringBuilder sb) {
        sb.append(jSONException.getMessage());
        BranchLogger.f(sb.toString());
    }
}
