package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingFooterData;
import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import au.com.woolworths.graphql.subscriptions.sse.channel.DefaultSideChannel;
import coil3.fetch.Fetcher;
import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jA;
        int i;
        Http2Stream[] http2StreamArr;
        switch (this.d) {
            case 0:
                ((Function1) this.e).invoke(((OnboardingFooterData) this.f).f7979a.d);
                return Unit.f24250a;
            case 1:
                ConnectionHandler connectionHandler = (ConnectionHandler) this.e;
                String url = (String) this.f;
                ChannelFactory channelFactory = connectionHandler.f9030a;
                channelFactory.getClass();
                Intrinsics.h(url, "url");
                return new DefaultSideChannel(url, channelFactory.f9036a, channelFactory.b);
            case 2:
                return CollectionsKt.Q(new Pair((Fetcher.Factory) this.e, (KClass) this.f));
            case 3:
                Http2Connection http2Connection = (Http2Connection) this.e;
                Http2Stream http2Stream = (Http2Stream) this.f;
                try {
                    http2Connection.d.d(http2Stream);
                } catch (IOException e) {
                    Platform.f26752a.getClass();
                    Platform.b.h(4, "Http2Connection.Listener failure for " + http2Connection.f, e);
                    try {
                        http2Stream.c(ErrorCode.g, e);
                    } catch (IOException unused) {
                    }
                }
                return Unit.f24250a;
            case 4:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.e;
                Settings settings = (Settings) this.f;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.A) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.v;
                            Settings settings3 = new Settings();
                            settings3.b(settings2);
                            settings3.b(settings);
                            objectRef.d = settings3;
                            jA = settings3.a() - settings2.a();
                            http2StreamArr = (jA == 0 || http2Connection2.e.isEmpty()) ? null : (Http2Stream[]) http2Connection2.e.values().toArray(new Http2Stream[0]);
                            Settings settings4 = (Settings) objectRef.d;
                            Intrinsics.h(settings4, "<set-?>");
                            http2Connection2.v = settings4;
                            TaskQueue.b(http2Connection2.m, http2Connection2.f + " onSettings", 0L, new f(5, http2Connection2, objectRef), 6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        http2Connection2.A.a((Settings) objectRef.d);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.g;
                        http2Connection2.a(errorCode, errorCode, e2);
                    }
                }
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream2 : http2StreamArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.h += jA;
                            if (jA > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                    }
                }
                return Unit.f24250a;
            default:
                Http2Connection http2Connection3 = (Http2Connection) this.e;
                http2Connection3.d.b(http2Connection3, (Settings) ((Ref.ObjectRef) this.f).d);
                return Unit.f24250a;
        }
    }
}
