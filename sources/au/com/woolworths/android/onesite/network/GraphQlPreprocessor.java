package au.com.woolworths.android.onesite.network;

import com.apollographql.apollo.ast.GQLArgument;
import com.apollographql.apollo.ast.GQLBooleanValue;
import com.apollographql.apollo.ast.GQLDirective;
import com.apollographql.apollo.ast.GQLEnumValue;
import com.apollographql.apollo.ast.GQLField;
import com.apollographql.apollo.ast.GQLFloatValue;
import com.apollographql.apollo.ast.GQLFragmentDefinition;
import com.apollographql.apollo.ast.GQLFragmentSpread;
import com.apollographql.apollo.ast.GQLInlineFragment;
import com.apollographql.apollo.ast.GQLIntValue;
import com.apollographql.apollo.ast.GQLListType;
import com.apollographql.apollo.ast.GQLListValue;
import com.apollographql.apollo.ast.GQLNamedType;
import com.apollographql.apollo.ast.GQLNode;
import com.apollographql.apollo.ast.GQLNonNullType;
import com.apollographql.apollo.ast.GQLSelection;
import com.apollographql.apollo.ast.GQLStringValue;
import com.apollographql.apollo.ast.GQLType;
import com.apollographql.apollo.ast.GQLValue;
import com.apollographql.apollo.ast.GQLVariableValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlPreprocessor;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphQlPreprocessor {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4570a;
    public final ArrayList b = new ArrayList();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();

    public GraphQlPreprocessor(String str, LinkedHashMap linkedHashMap) {
        this.f4570a = linkedHashMap;
    }

    public static String b(GQLType gQLType) {
        if (gQLType instanceof GQLNamedType) {
            return ((GQLNamedType) gQLType).getF13557a();
        }
        if (gQLType instanceof GQLNonNullType) {
            return YU.a.g(b(((GQLNonNullType) gQLType).getF13558a()), "!");
        }
        if (gQLType instanceof GQLListType) {
            return YU.a.h("[", b(((GQLListType) gQLType).getF13555a()), "]");
        }
        throw new UnsupportedOperationException("Unsupported type: " + gQLType);
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Collection] */
    public final void a(GQLNode gQLNode, LinkedHashMap linkedHashMap) {
        boolean z;
        boolean zC;
        List b = gQLNode.getB();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (obj instanceof GQLDirective) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                zC = true;
                break;
            }
            GQLDirective gQLDirective = (GQLDirective) it.next();
            Object objCollect = gQLDirective.b.stream().collect(Collectors.toMap(new a(0), Function.identity(), new BinaryOperator() { // from class: au.com.woolworths.android.onesite.network.b
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return obj2;
                }
            }));
            Intrinsics.g(objCollect, "collect(...)");
            GQLArgument gQLArgument = (GQLArgument) ((Map) objCollect).get("if");
            if (gQLArgument != null) {
                GQLValue b2 = gQLArgument.getB();
                Intrinsics.f(b2, "null cannot be cast to non-null type com.apollographql.apollo.ast.GQLVariableValue");
                GQLVariableValue gQLVariableValue = (GQLVariableValue) b2;
                String str = gQLDirective.f13539a;
                if (!Intrinsics.c(str, "skip")) {
                    if (Intrinsics.c(str, "include")) {
                        zC = Intrinsics.c(linkedHashMap.get(gQLVariableValue.getF13571a()), Boolean.TRUE);
                        break;
                    }
                } else {
                    zC = Intrinsics.c(linkedHashMap.get(gQLVariableValue.getF13571a()), Boolean.FALSE);
                    break;
                }
            }
        }
        if (zC) {
            boolean z2 = gQLNode instanceof GQLField;
            ArrayList arrayList2 = this.b;
            if (z2) {
                GQLField gQLField = (GQLField) gQLNode;
                String str2 = gQLField.f13545a;
                if (str2 != null) {
                    GraphQlPreprocessorKt.a(arrayList2, str2, ":");
                }
                arrayList2.add(gQLField.b);
                Object obj2 = gQLField.c;
                if (!((Collection) obj2).isEmpty()) {
                    arrayList2.add("(");
                    for (GQLArgument gQLArgument2 : (Iterable) obj2) {
                        GraphQlPreprocessorKt.a(arrayList2, gQLArgument2.getF13537a(), ":", c(gQLArgument2.getB()), ",");
                    }
                    arrayList2.remove(CollectionsKt.I(arrayList2));
                    arrayList2.add(")");
                }
            } else if (gQLNode instanceof GQLInlineFragment) {
                GQLNamedType gQLNamedType = ((GQLInlineFragment) gQLNode).f13550a;
                Intrinsics.e(gQLNamedType);
                GraphQlPreprocessorKt.a(arrayList2, "...", "on", gQLNamedType.getF13557a());
            } else if (gQLNode instanceof GQLFragmentSpread) {
                String str3 = ((GQLFragmentSpread) gQLNode).f13549a;
                GraphQlPreprocessorKt.a(arrayList2, "...", str3);
                this.c.add(str3);
            } else if (gQLNode instanceof GQLFragmentDefinition) {
                GQLFragmentDefinition gQLFragmentDefinition = (GQLFragmentDefinition) gQLNode;
                GraphQlPreprocessorKt.a(arrayList2, "fragment", gQLFragmentDefinition.f13548a, "on", gQLFragmentDefinition.b.getF13557a());
            }
            List b3 = gQLNode.getB();
            if ((b3 instanceof Collection) && b3.isEmpty()) {
                z = false;
            } else {
                Iterator it2 = b3.iterator();
                while (it2.hasNext()) {
                    if (((GQLNode) it2.next()) instanceof GQLSelection) {
                        break;
                    }
                }
                z = false;
            }
            if (z) {
                List b4 = gQLNode.getB();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : b4) {
                    if (obj3 instanceof GQLSelection) {
                        arrayList3.add(obj3);
                    }
                }
                arrayList2.add("{");
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    a((GQLSelection) it3.next(), linkedHashMap);
                }
                arrayList2.add("}");
            }
        }
    }

    public final String c(GQLValue gQLValue) {
        if (gQLValue instanceof GQLVariableValue) {
            GQLVariableValue gQLVariableValue = (GQLVariableValue) gQLValue;
            this.d.add(gQLVariableValue.getF13571a());
            return YU.a.A("$", gQLVariableValue.getF13571a());
        }
        if (gQLValue instanceof GQLBooleanValue) {
            return String.valueOf(((GQLBooleanValue) gQLValue).getF13538a());
        }
        if (gQLValue instanceof GQLStringValue) {
            return YU.a.h("\"", ((GQLStringValue) gQLValue).getF13567a(), "\"");
        }
        if (gQLValue instanceof GQLFloatValue) {
            return ((GQLFloatValue) gQLValue).getF13547a();
        }
        if (gQLValue instanceof GQLIntValue) {
            return ((GQLIntValue) gQLValue).getF13553a();
        }
        if (gQLValue instanceof GQLEnumValue) {
            return ((GQLEnumValue) gQLValue).getF13543a();
        }
        if (!(gQLValue instanceof GQLListValue)) {
            throw new UnsupportedOperationException("Unsupported value: " + gQLValue);
        }
        List listA = ((GQLListValue) gQLValue).a();
        ArrayList arrayListZ = CollectionsKt.Z("[");
        if (!listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                GraphQlPreprocessorKt.a(arrayListZ, c((GQLValue) it.next()), ",");
            }
            arrayListZ.remove(CollectionsKt.I(arrayListZ));
        }
        arrayListZ.add("]");
        return CollectionsKt.M(arrayListZ, " ", null, null, null, 62);
    }
}
