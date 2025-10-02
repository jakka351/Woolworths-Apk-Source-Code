package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes7.dex */
final class SignatureEnhancementBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24451a = new LinkedHashMap();

    public final class ClassEnhancementBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final String f24452a;
        public final /* synthetic */ SignatureEnhancementBuilder b;

        @SourceDebugExtension
        public final class FunctionEnhancementBuilder {

            /* renamed from: a, reason: collision with root package name */
            public final String f24453a;
            public final ArrayList b = new ArrayList();
            public Pair c = new Pair("V", null);

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2) {
                this.f24453a = str2;
            }

            public final void a(String type, JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                Intrinsics.h(type, "type");
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    IndexingIterable indexingIterable = new IndexingIterable(new c(javaTypeQualifiersArr, 27));
                    int iH = MapsKt.h(CollectionsKt.s(indexingIterable, 10));
                    if (iH < 16) {
                        iH = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                    Iterator it = indexingIterable.iterator();
                    while (true) {
                        IndexingIterator indexingIterator = (IndexingIterator) it;
                        if (!indexingIterator.d.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f24254a), (JavaTypeQualifiers) indexedValue.b);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                this.b.add(new Pair(type, typeEnhancementInfo));
            }

            public final void b(String type, JavaTypeQualifiers... javaTypeQualifiersArr) {
                Intrinsics.h(type, "type");
                IndexingIterable indexingIterable = new IndexingIterable(new c(javaTypeQualifiersArr, 27));
                int iH = MapsKt.h(CollectionsKt.s(indexingIterable, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                Iterator it = indexingIterable.iterator();
                while (true) {
                    IndexingIterator indexingIterator = (IndexingIterator) it;
                    if (!indexingIterator.d.hasNext()) {
                        this.c = new Pair(type, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f24254a), (JavaTypeQualifiers) indexedValue.b);
                    }
                }
            }

            public final void c(JvmPrimitiveType type) {
                Intrinsics.h(type, "type");
                String strC = type.c();
                Intrinsics.g(strC, "getDesc(...)");
                this.c = new Pair(strC, null);
            }
        }

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, String className) {
            Intrinsics.h(className, "className");
            this.b = signatureEnhancementBuilder;
            this.f24452a = className;
        }

        public final void a(String str, String str2, Function1 function1) {
            LinkedHashMap linkedHashMap = this.b.f24451a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str, str2);
            function1.invoke(functionEnhancementBuilder);
            ArrayList arrayList = functionEnhancementBuilder.b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).d);
            }
            String strF = SignatureBuildingComponents.f(this.f24452a, SignatureBuildingComponents.e(str, (String) functionEnhancementBuilder.c.d, arrayList2));
            TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) functionEnhancementBuilder.c.e;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((TypeEnhancementInfo) ((Pair) it2.next()).e);
            }
            linkedHashMap.put(strF, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList3, functionEnhancementBuilder.f24453a));
        }
    }
}
