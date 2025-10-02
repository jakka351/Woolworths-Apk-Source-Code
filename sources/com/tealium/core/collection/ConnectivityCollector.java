package com.tealium.core.collection;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tealium.core.Collector;
import com.tealium.core.CollectorFactory;
import com.tealium.core.TealiumContext;
import com.tealium.core.network.Connectivity;
import com.tealium.core.network.ConnectivityRetriever;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/collection/ConnectivityCollector;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/collection/ConnectivityData;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ConnectivityCollector implements Collector, ConnectivityData {

    @NotNull
    public static final String MODULE_VERSION = "1.6.0";
    public static final Companion d = new Companion();
    public static volatile ConnectivityCollector e;

    /* renamed from: a, reason: collision with root package name */
    public final Connectivity f19134a;
    public boolean b = true;
    public final TelephonyManager c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tealium/core/collection/ConnectivityCollector$Companion;", "Lcom/tealium/core/CollectorFactory;", "", "MODULE_VERSION", "Ljava/lang/String;", "Lcom/tealium/core/collection/ConnectivityCollector;", "instance", "Lcom/tealium/core/collection/ConnectivityCollector;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements CollectorFactory {
        @Override // com.tealium.core.CollectorFactory
        public final Collector a(TealiumContext context) {
            ConnectivityCollector connectivityCollector;
            Intrinsics.h(context, "context");
            ConnectivityCollector connectivityCollector2 = ConnectivityCollector.e;
            if (connectivityCollector2 != null) {
                return connectivityCollector2;
            }
            synchronized (this) {
                connectivityCollector = ConnectivityCollector.e;
                if (connectivityCollector == null) {
                    Context applicationContext = context.f19130a.f19129a.getApplicationContext();
                    Intrinsics.g(applicationContext, "context.config.application.applicationContext");
                    connectivityCollector = new ConnectivityCollector(applicationContext, ConnectivityRetriever.b.a(context.f19130a.f19129a));
                    ConnectivityCollector.e = connectivityCollector;
                }
            }
            return connectivityCollector;
        }
    }

    public ConnectivityCollector(Context context, Connectivity connectivity) {
        this.f19134a = connectivity;
        Object systemService = context.getApplicationContext().getSystemService("phone");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
        this.c = (TelephonyManager) systemService;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getC() {
        return "Connectivity";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        String str;
        String str2;
        String strSubstring;
        String str3;
        String strSubstring2;
        Connectivity connectivity = this.f19134a;
        Pair pair = new Pair("connection_type", connectivity.b());
        Pair pair2 = new Pair("device_connected", Boolean.valueOf(connectivity.isConnected()));
        TelephonyManager telephonyManager = this.c;
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (networkOperatorName == null) {
            networkOperatorName = "";
            str = networkOperatorName;
        } else {
            str = "";
        }
        Pair pair3 = new Pair("carrier", networkOperatorName);
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (networkCountryIso == null) {
            networkCountryIso = str;
            str2 = networkCountryIso;
        } else {
            str2 = str;
        }
        Pair pair4 = new Pair("carrier_iso", networkCountryIso);
        String operator = telephonyManager.getNetworkOperator();
        Intrinsics.g(operator, "operator");
        if (StringsKt.D(operator) || operator.length() <= 3) {
            strSubstring = str2;
            str3 = strSubstring;
        } else {
            String networkOperator = telephonyManager.getNetworkOperator();
            Intrinsics.g(networkOperator, "telephonyManager.networkOperator");
            strSubstring = networkOperator.substring(0, 3);
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            str3 = str2;
        }
        Pair pair5 = new Pair("carrier_mcc", strSubstring);
        String operator2 = telephonyManager.getNetworkOperator();
        Intrinsics.g(operator2, "operator");
        if (StringsKt.D(operator2) || operator2.length() <= 3) {
            strSubstring2 = str3;
        } else {
            strSubstring2 = operator2.substring(3);
            Intrinsics.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
        }
        return MapsKt.j(pair, pair2, pair3, pair4, pair5, new Pair("carrier_mnc", strSubstring2));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.b = z;
    }
}
