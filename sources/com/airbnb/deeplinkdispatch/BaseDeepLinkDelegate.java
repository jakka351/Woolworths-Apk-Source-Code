package com.airbnb.deeplinkdispatch;

import YU.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.core.impl.b;
import androidx.core.app.TaskStackBuilder;
import au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity;
import com.airbnb.deeplinkdispatch.handler.DeepLinkParamType;
import com.airbnb.deeplinkdispatch.handler.DeeplinkParam;
import com.airbnb.deeplinkdispatch.handler.TypeConverters;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/deeplinkdispatch/BaseDeepLinkDelegate;", "", "Companion", "DeeplLinkMethodError", "IntermediateDeepLinkResult", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class BaseDeepLinkDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final List f13286a;
    public final Function0 b;
    public final Function3 c;
    public final Function3 d;
    public final LinkedHashMap e;
    public final Lazy f;
    public final Lazy g;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/airbnb/deeplinkdispatch/handler/TypeConverters;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<TypeConverters> {
        public static final AnonymousClass1 h = new AnonymousClass1(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new TypeConverters();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "<anonymous parameter 1>", "Ljava/lang/reflect/Type;", "<anonymous parameter 2>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function3 {
        public static final AnonymousClass2 h = new AnonymousClass2(3);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Intrinsics.h((DeepLinkUri) obj, "<anonymous parameter 0>");
            Intrinsics.h((Type) obj2, "<anonymous parameter 1>");
            Intrinsics.h((String) obj3, "<anonymous parameter 2>");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "<anonymous parameter 1>", "Ljava/lang/reflect/Type;", "<anonymous parameter 2>", "", "invoke", "(Lcom/airbnb/deeplinkdispatch/DeepLinkUri;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function3<DeepLinkUri, Type, String, Integer> {
        public static final AnonymousClass3 h = new AnonymousClass3(3);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Intrinsics.h((DeepLinkUri) obj, "<anonymous parameter 0>");
            Intrinsics.h((Type) obj2, "<anonymous parameter 1>");
            Intrinsics.h((String) obj3, "<anonymous parameter 2>");
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/deeplinkdispatch/BaseDeepLinkDelegate$Companion;", "", "", "TAG", "Ljava/lang/String;", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/deeplinkdispatch/BaseDeepLinkDelegate$DeeplLinkMethodError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeeplLinkMethodError extends IllegalStateException {
        public final Throwable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeeplLinkMethodError(String message, ReflectiveOperationException reflectiveOperationException) {
            super(message, reflectiveOperationException);
            Intrinsics.h(message, "message");
            this.d = reflectiveOperationException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/BaseDeepLinkDelegate$IntermediateDeepLinkResult;", "", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IntermediateDeepLinkResult {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f13287a;
        public final TaskStackBuilder b;
        public final DeepLinkHandlerResult c;

        public IntermediateDeepLinkResult(Intent intent, TaskStackBuilder taskStackBuilder, DeepLinkHandlerResult deepLinkHandlerResult) {
            this.f13287a = intent;
            this.b = taskStackBuilder;
            this.c = deepLinkHandlerResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntermediateDeepLinkResult)) {
                return false;
            }
            IntermediateDeepLinkResult intermediateDeepLinkResult = (IntermediateDeepLinkResult) obj;
            return Intrinsics.c(this.f13287a, intermediateDeepLinkResult.f13287a) && Intrinsics.c(this.b, intermediateDeepLinkResult.b) && Intrinsics.c(this.c, intermediateDeepLinkResult.c);
        }

        public final int hashCode() {
            Intent intent = this.f13287a;
            int iHashCode = (intent == null ? 0 : intent.hashCode()) * 31;
            TaskStackBuilder taskStackBuilder = this.b;
            int iHashCode2 = (iHashCode + (taskStackBuilder == null ? 0 : taskStackBuilder.hashCode())) * 31;
            DeepLinkHandlerResult deepLinkHandlerResult = this.c;
            return iHashCode2 + (deepLinkHandlerResult != null ? deepLinkHandlerResult.hashCode() : 0);
        }

        public final String toString() {
            return "IntermediateDeepLinkResult(intent=" + this.f13287a + ", taskStackBuilder=" + this.b + ", deepLinkHandlerResult=" + this.c + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DeepLinkParamType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BaseDeepLinkDelegate(List registries) {
        Intrinsics.h(registries, "registries");
        Map map = EmptyMap.d;
        this.f13286a = registries;
        this.b = AnonymousClass1.h;
        this.c = AnonymousClass2.h;
        this.d = AnonymousClass3.h;
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            Charset charset = Charsets.f24671a;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = ((String) entry.getValue()).getBytes(charset);
            Intrinsics.g(bytes2, "this as java.lang.String).getBytes(charset)");
            linkedHashMap.put(bytes, bytes2);
        }
        this.e = linkedHashMap;
        List registries2 = this.f13286a;
        Intrinsics.h(registries2, "registries");
        ExecutorService executorService = DeepLinkDispatch.f13289a;
        ArrayList arrayList = new ArrayList();
        Iterator it = registries2.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((BaseRegistry) it.next()).f13288a, arrayList);
        }
        Set setL0 = CollectionsKt.L0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setL0) {
            byte[] bArr = (byte[]) obj;
            Set setKeySet = linkedHashMap.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    if (Arrays.equals((byte[]) it2.next(), bArr)) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        String strM = CollectionsKt.M(arrayList2, ",\n", null, null, UtilsKt$validateConfigurablePathSegmentReplacements$1$missingKeys$2.h, 30);
        if (strM.length() != 0) {
            throw new IllegalArgumentException(b.r(a.u("Keys not found in BaseDeepLinkDelegate's mapping of PathVariableReplacementValues. Missing keys are:\n", strM, ".\nKeys in mapping are:\n"), CollectionsKt.M(linkedHashMap.keySet(), ",\n", null, null, UtilsKt$validateConfigurablePathSegmentReplacements$1$1$1.h, 30), JwtParser.SEPARATOR_CHAR).toString());
        }
        this.f = LazyKt.b(new Function0<List<? extends DeepLinkEntry>>() { // from class: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate$allDeepLinkEntries$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDeepLinkDelegateKt.a(this.h.f13286a);
            }
        });
        this.g = LazyKt.b(new Function0<Map<DeepLinkEntry, ? extends List<? extends DeepLinkEntry>>>() { // from class: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate$duplicatedDeepLinkEntries$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.h.f13286a;
                Intrinsics.h(list, "<this>");
                ArrayList arrayListA = BaseDeepLinkDelegateKt.a(list);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayListA.iterator();
                while (it3.hasNext()) {
                    DeepLinkEntry deepLinkEntry = (DeepLinkEntry) it3.next();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayListA.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        DeepLinkEntry other = (DeepLinkEntry) next;
                        if (deepLinkEntry != other) {
                            deepLinkEntry.getClass();
                            Intrinsics.h(other, "other");
                            if (Intrinsics.c((String) deepLinkEntry.g.getD(), (String) other.g.getD())) {
                                arrayList4.add(next);
                            }
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    Pair pair = arrayList4 != null ? new Pair(deepLinkEntry, arrayList4) : null;
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                return MapsKt.p(arrayList3);
            }
        });
    }

    public static Class a(Class cls) {
        Type[] actualTypeArguments;
        Class clsC;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        Intrinsics.g(genericInterfaces, "handlerClazz.genericInterfaces");
        ArrayList arrayList = new ArrayList();
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                arrayList.add(type);
            }
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                Type rawType = ((ParameterizedType) next).getRawType();
                Intrinsics.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                String canonicalName = ((Class) rawType).getCanonicalName();
                Intrinsics.g(canonicalName, "it.rawType as Class<*>).canonicalName");
                if (StringsKt.W(canonicalName, com.airbnb.deeplinkdispatch.handler.DeepLinkHandler.class.getName(), false)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (parameterizedType != null && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && (clsC = c(actualTypeArguments)) != null) {
            return clsC;
        }
        if (!(cls.getGenericSuperclass() instanceof ParameterizedType)) {
            Type genericSuperclass = cls.getGenericSuperclass();
            Intrinsics.f(genericSuperclass, "null cannot be cast to non-null type java.lang.Class<*>");
            return a((Class) genericSuperclass);
        }
        Type genericSuperclass2 = cls.getGenericSuperclass();
        Intrinsics.f(genericSuperclass2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass2).getActualTypeArguments();
        Intrinsics.g(actualTypeArguments2, "handlerClazz.genericSupe…Type).actualTypeArguments");
        return c(actualTypeArguments2);
    }

    public static Class c(Type[] typeArr) throws SecurityException {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Type type : typeArr) {
            if (type instanceof Class) {
                arrayList.add(type);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                Class cls = (Class) next;
                if (!Intrinsics.c(cls, Object.class)) {
                    Constructor<?>[] constructors = cls.getConstructors();
                    Intrinsics.g(constructors, "typeArgumentClass.constructors");
                    for (Constructor<?> constructor : constructors) {
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        Intrinsics.g(parameterAnnotations, "constructor.parameterAnnotations");
                        for (Annotation[] parameter : parameterAnnotations) {
                            Intrinsics.g(parameter, "parameter");
                            for (Annotation annotation : parameter) {
                                if (!JvmClassMappingKt.a(annotation).equals(Reflection.f24268a.b(DeeplinkParam.class))) {
                                }
                            }
                        }
                    }
                }
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            } else {
                if (!z) {
                    break;
                }
                obj = obj2;
            }
        }
        obj = null;
        return (Class) obj;
    }

    public static IntermediateDeepLinkResult d(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.c(returnType, TaskStackBuilder.class)) {
            String name = method.getName();
            Intrinsics.g(name, "method.name");
            return e((TaskStackBuilder) obj, name);
        }
        if (!Intrinsics.c(returnType, DeepLinkMethodResult.class)) {
            return new IntermediateDeepLinkResult((Intent) obj, null, null);
        }
        DeepLinkMethodResult deepLinkMethodResult = (DeepLinkMethodResult) obj;
        String name2 = method.getName();
        Intrinsics.g(name2, "method.name");
        if ((deepLinkMethodResult != null ? deepLinkMethodResult.b : null) != null) {
            return e(deepLinkMethodResult.b, name2);
        }
        return new IntermediateDeepLinkResult(deepLinkMethodResult != null ? deepLinkMethodResult.f13291a : null, null, null);
    }

    public static IntermediateDeepLinkResult e(TaskStackBuilder taskStackBuilder, String str) {
        if (taskStackBuilder == null || taskStackBuilder.d.size() != 0) {
            return new IntermediateDeepLinkResult(taskStackBuilder != null ? (Intent) a.c(1, taskStackBuilder.d) : null, taskStackBuilder, null);
        }
        throw new DeeplLinkMethodError(a.h("Could not deep link to method: ", str, " intents length == 0"), null);
    }

    public final DeepLinkResult b(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, Intent intent, DeepLinkMatchResult deepLinkMatchResult) {
        Set<String> setUnmodifiableSet;
        List<String> listUnmodifiableList;
        Uri data = intent.getData();
        if (data == null) {
            return new DeepLinkResult(false, null, "No Uri in given activity's intent.", null, deepLinkMatchResult, null, null, null, 234);
        }
        DeepLinkUri deepLinkUri = DeepLinkUri.e(data.toString(), false);
        if (deepLinkMatchResult == null) {
            return new DeepLinkResult(false, null, "DeepLinkEntry cannot be null", null, null, null, null, null, 250);
        }
        Intrinsics.g(deepLinkUri, "deepLinkUri");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = deepLinkUri.d;
        Map map = (Map) deepLinkMatchResult.e.get(deepLinkUri);
        if (map == null) {
            map = EmptyMap.d;
        }
        linkedHashMap.putAll(map);
        if (list == null) {
            setUnmodifiableSet = Collections.EMPTY_SET;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                linkedHashSet.add((String) list.get(i));
            }
            setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        for (String queryParameter : setUnmodifiableSet) {
            if (list == null) {
                listUnmodifiableList = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2 += 2) {
                    if (queryParameter.equals(list.get(i2))) {
                        arrayList.add((String) list.get(i2 + 1));
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            }
            for (String str : listUnmodifiableList) {
                if (linkedHashMap.containsKey(queryParameter)) {
                    Log.w("DeepLinkDelegate", "Duplicate parameter name in path and query param: " + queryParameter);
                }
                Intrinsics.g(queryParameter, "queryParameter");
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(queryParameter, str);
            }
        }
        Bundle bundle = intent.getExtras() != null ? new Bundle(intent.getExtras()) : new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        bundle.putString("deep_link_uri", data.toString());
        try {
        } catch (DeeplLinkMethodError e) {
            e = e;
        }
        try {
            IntermediateDeepLinkResult intermediateDeepLinkResultF = f(deepLinkMatchResult.d, linkedHashMap, shopAppDeepLinkHandlerActivity, bundle);
            TaskStackBuilder taskStackBuilder = intermediateDeepLinkResultF.b;
            Intent intent2 = intermediateDeepLinkResultF.f13287a;
            if (intent2 == null) {
                return new DeepLinkResult(false, data.toString(), "Destination Intent is null!", null, deepLinkMatchResult, new DeepLinkMethodResult(intent2, taskStackBuilder), null, intermediateDeepLinkResultF.c, 72);
            }
            if (intent2.getAction() == null) {
                intent2.setAction(intent.getAction());
            }
            if (intent2.getData() == null) {
                intent2.setData(intent.getData());
            }
            intent2.putExtras(UtilsKt.a(bundle, new BaseDeepLinkDelegate$createResult$1$1(intent2)));
            intent2.putExtra("is_deep_link_flag", true);
            intent2.putExtra("android.intent.extra.REFERRER", data);
            if (shopAppDeepLinkHandlerActivity.getCallingActivity() != null) {
                intent2.setFlags(33554432);
            }
            return new DeepLinkResult(true, data.toString(), null, null, deepLinkMatchResult, new DeepLinkMethodResult(intent2, taskStackBuilder), linkedHashMap, intermediateDeepLinkResultF.c, 12);
        } catch (DeeplLinkMethodError e2) {
            e = e2;
            DeeplLinkMethodError deeplLinkMethodError = e;
            String string = data.toString();
            String message = deeplLinkMethodError.getMessage();
            return new DeepLinkResult(false, string, message == null ? "" : message, deeplLinkMethodError, deepLinkMatchResult, null, null, null, BERTags.FLAGS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        if (r6 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r8v30, types: [kotlin.jvm.functions.Function3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate.IntermediateDeepLinkResult f(com.airbnb.deeplinkdispatch.DeepLinkEntry r19, java.util.LinkedHashMap r20, au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity r21, android.os.Bundle r22) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate.f(com.airbnb.deeplinkdispatch.DeepLinkEntry, java.util.LinkedHashMap, au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity, android.os.Bundle):com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate$IntermediateDeepLinkResult");
    }
}
