package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.Extension;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.services.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchMethodException, SecurityException {
        Extension extension;
        String strC;
        String strA;
        int i = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ExtensionContainer extensionContainer = (ExtensionContainer) obj;
                Function1 function1 = (Function1) obj2;
                Class cls = extensionContainer.f13183a;
                Intrinsics.h(cls, "<this>");
                String strD = null;
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(ExtensionApi.class);
                    declaredConstructor.setAccessible(true);
                    extension = (Extension) declaredConstructor.newInstance(extensionContainer);
                } catch (Exception e) {
                    cls.toString();
                    e.toString();
                    Log.a();
                    extension = null;
                }
                if (extension == null) {
                    ((EventHub$registerExtension$1$container$1) function1).invoke(EventHubError.f);
                    break;
                } else {
                    try {
                        strC = extension.c();
                    } catch (Exception unused) {
                        strC = null;
                    }
                    if (strC == null || StringsKt.D(strC)) {
                        ((EventHub$registerExtension$1$container$1) function1).invoke(EventHubError.d);
                        break;
                    } else {
                        extensionContainer.f = extension;
                        extensionContainer.b = strC;
                        try {
                            strA = extension.a();
                        } catch (Exception unused2) {
                            strA = null;
                        }
                        extensionContainer.c = strA;
                        try {
                            strD = extension.d();
                        } catch (Exception unused3) {
                        }
                        extensionContainer.d = strD;
                        extensionContainer.g = MapsKt.j(new Pair(SharedStateType.e, new SharedStateManager(strC)), new Pair(SharedStateType.d, new SharedStateManager(strC)));
                        extensionContainer.i();
                        Log.a();
                        ((EventHub$registerExtension$1$container$1) function1).invoke(EventHubError.h);
                        try {
                            extension.e();
                            break;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                EventHub this$0 = (EventHub) obj;
                Event event = (Event) obj2;
                EventHub eventHub = EventHub.m;
                Intrinsics.h(this$0, "this$0");
                Intrinsics.h(event, "$event");
                this$0.c(event);
                break;
            case 2:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj2;
                for (ResponseListenerContainer responseListenerContainer : (ArrayList) obj) {
                    Event event2 = (Event) objectRef.d;
                    responseListenerContainer.getClass();
                    Intrinsics.h(event2, "event");
                    try {
                        responseListenerContainer.c.a(event2);
                    } catch (Exception e2) {
                        e2.toString();
                        Log.a();
                    }
                }
                break;
            default:
                Function1 it = (Function1) obj2;
                EventHubError error = (EventHubError) obj;
                Intrinsics.h(it, "$it");
                Intrinsics.h(error, "$error");
                it.invoke(error);
                break;
        }
    }

    public /* synthetic */ g(Function1 function1, EventHubError eventHubError) {
        this.d = 3;
        this.f = function1;
        this.e = eventHubError;
    }
}
