package au.com.woolworths.shop.deliveryunlimited.signup;

import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribePayment;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribePayment$2$1", f = "DeliveryUnlimitedSignUpRepository.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribePayment$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeliveryUnlimitedSubscribePayment>, Object> {
    public int p;
    public final /* synthetic */ DeliveryUnlimitedSignUpRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribePayment$2$1(DeliveryUnlimitedSignUpRepository deliveryUnlimitedSignUpRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = deliveryUnlimitedSignUpRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribePayment$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribePayment$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
