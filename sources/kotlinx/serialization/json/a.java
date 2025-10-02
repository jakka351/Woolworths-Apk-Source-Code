package kotlinx.serialization.json;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.internal.StringOpsKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f24842a;
                Intrinsics.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                final int i = 1;
                final Function0 function0 = new Function0() { // from class: kotlinx.serialization.json.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.f24842a;
                                return JsonLiteralSerializer.b;
                            case 1:
                                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.f24842a;
                                return JsonPrimitiveSerializer.b;
                            case 2:
                                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.f24842a;
                                return JsonNullSerializer.b;
                            case 3:
                                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.f24842a;
                                return JsonObjectSerializer.b;
                            default:
                                JsonElementSerializer jsonElementSerializer6 = JsonElementSerializer.f24842a;
                                return JsonArraySerializer.b;
                        }
                    }
                };
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "JsonPrimitive", new SerialDescriptor(function0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* renamed from: a, reason: collision with root package name */
                    public final Lazy f24843a;

                    {
                        this.f24843a = LazyKt.b(function0);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f24843a.getD();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.h(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i2) {
                        return a().d(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: f */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String g(int i2) {
                        return a().g(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.d;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List h(int i2) {
                        return a().h(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: i */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: isInline */
                    public final boolean getL() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean j(int i2) {
                        return a().j(i2);
                    }
                });
                final int i2 = 2;
                final Function0 function02 = new Function0() { // from class: kotlinx.serialization.json.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.f24842a;
                                return JsonLiteralSerializer.b;
                            case 1:
                                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.f24842a;
                                return JsonPrimitiveSerializer.b;
                            case 2:
                                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.f24842a;
                                return JsonNullSerializer.b;
                            case 3:
                                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.f24842a;
                                return JsonObjectSerializer.b;
                            default:
                                JsonElementSerializer jsonElementSerializer6 = JsonElementSerializer.f24842a;
                                return JsonArraySerializer.b;
                        }
                    }
                };
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "JsonNull", new SerialDescriptor(function02) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* renamed from: a, reason: collision with root package name */
                    public final Lazy f24843a;

                    {
                        this.f24843a = LazyKt.b(function02);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f24843a.getD();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.h(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i22) {
                        return a().d(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: f */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String g(int i22) {
                        return a().g(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.d;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List h(int i22) {
                        return a().h(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: i */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: isInline */
                    public final boolean getL() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean j(int i22) {
                        return a().j(i22);
                    }
                });
                final int i3 = 0;
                final Function0 function03 = new Function0() { // from class: kotlinx.serialization.json.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.f24842a;
                                return JsonLiteralSerializer.b;
                            case 1:
                                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.f24842a;
                                return JsonPrimitiveSerializer.b;
                            case 2:
                                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.f24842a;
                                return JsonNullSerializer.b;
                            case 3:
                                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.f24842a;
                                return JsonObjectSerializer.b;
                            default:
                                JsonElementSerializer jsonElementSerializer6 = JsonElementSerializer.f24842a;
                                return JsonArraySerializer.b;
                        }
                    }
                };
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "JsonLiteral", new SerialDescriptor(function03) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* renamed from: a, reason: collision with root package name */
                    public final Lazy f24843a;

                    {
                        this.f24843a = LazyKt.b(function03);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f24843a.getD();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.h(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i22) {
                        return a().d(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: f */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String g(int i22) {
                        return a().g(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.d;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List h(int i22) {
                        return a().h(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: i */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: isInline */
                    public final boolean getL() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean j(int i22) {
                        return a().j(i22);
                    }
                });
                final int i4 = 3;
                final Function0 function04 = new Function0() { // from class: kotlinx.serialization.json.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.f24842a;
                                return JsonLiteralSerializer.b;
                            case 1:
                                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.f24842a;
                                return JsonPrimitiveSerializer.b;
                            case 2:
                                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.f24842a;
                                return JsonNullSerializer.b;
                            case 3:
                                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.f24842a;
                                return JsonObjectSerializer.b;
                            default:
                                JsonElementSerializer jsonElementSerializer6 = JsonElementSerializer.f24842a;
                                return JsonArraySerializer.b;
                        }
                    }
                };
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "JsonObject", new SerialDescriptor(function04) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* renamed from: a, reason: collision with root package name */
                    public final Lazy f24843a;

                    {
                        this.f24843a = LazyKt.b(function04);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f24843a.getD();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.h(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i22) {
                        return a().d(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: f */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String g(int i22) {
                        return a().g(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.d;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List h(int i22) {
                        return a().h(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: i */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: isInline */
                    public final boolean getL() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean j(int i22) {
                        return a().j(i22);
                    }
                });
                final int i5 = 4;
                final Function0 function05 = new Function0() { // from class: kotlinx.serialization.json.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.f24842a;
                                return JsonLiteralSerializer.b;
                            case 1:
                                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.f24842a;
                                return JsonPrimitiveSerializer.b;
                            case 2:
                                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.f24842a;
                                return JsonNullSerializer.b;
                            case 3:
                                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.f24842a;
                                return JsonObjectSerializer.b;
                            default:
                                JsonElementSerializer jsonElementSerializer6 = JsonElementSerializer.f24842a;
                                return JsonArraySerializer.b;
                        }
                    }
                };
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "JsonArray", new SerialDescriptor(function05) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* renamed from: a, reason: collision with root package name */
                    public final Lazy f24843a;

                    {
                        this.f24843a = LazyKt.b(function05);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f24843a.getD();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.h(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i22) {
                        return a().d(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: f */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String g(int i22) {
                        return a().g(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.d;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List h(int i22) {
                        return a().h(i22);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: i */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* renamed from: isInline */
                    public final boolean getL() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean j(int i22) {
                        return a().j(i22);
                    }
                });
                return Unit.f24250a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.h(entry, "<destruct>");
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                StringOpsKt.a(sb, str);
                sb.append(':');
                sb.append(jsonElement);
                String string = sb.toString();
                Intrinsics.g(string, "toString(...)");
                return string;
        }
    }
}
