package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.repository.NoResultsException;
import au.com.woolworths.feature.shop.delivery.address.DeliveryAddressInteractor;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel$onPostcodeTextChanged$1", f = "AddDeliveryAddressManuallyViewModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddDeliveryAddressManuallyViewModel$onPostcodeTextChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddDeliveryAddressManuallyViewModel q;
    public final /* synthetic */ CharSequence r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDeliveryAddressManuallyViewModel$onPostcodeTextChanged$1(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.q = addDeliveryAddressManuallyViewModel;
        this.r = charSequence;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddDeliveryAddressManuallyViewModel$onPostcodeTextChanged$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddDeliveryAddressManuallyViewModel$onPostcodeTextChanged$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.AndroidViewModel, au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel] */
    /* JADX WARN: Type inference failed for: r5v6, types: [au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        EmptyList emptyList = EmptyList.d;
        AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel = 1;
        addDeliveryAddressManuallyViewModel = 1;
        addDeliveryAddressManuallyViewModel = 1;
        CharSequence charSequence = this.r;
        AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel2 = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                DeliveryAddressInteractor deliveryAddressInteractor = addDeliveryAddressManuallyViewModel2.f;
                String string = charSequence.toString();
                this.p = 1;
                objB = deliveryAddressInteractor.f7045a.b(string, this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objB = obj;
            }
            List list = (List) objB;
            try {
                if (list.isEmpty()) {
                    AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel3 = addDeliveryAddressManuallyViewModel2;
                    AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel3, addDeliveryAddressManuallyViewModel3.i, false, null, null, charSequence.toString(), emptyList, null, addDeliveryAddressManuallyViewModel3.p6().getString(R.string.delivery_address_error_invalid_postcode), 7);
                    addDeliveryAddressManuallyViewModel3.v6("Invalid postcode");
                    addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel3;
                } else {
                    AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel4 = addDeliveryAddressManuallyViewModel2;
                    try {
                        AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel4, addDeliveryAddressManuallyViewModel4.i, false, null, null, charSequence.toString(), list, null, null, 39);
                        addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel4;
                    } catch (NoConnectivityException unused) {
                        addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel4;
                        AddDeliveryAddressManuallyViewModel.r6(addDeliveryAddressManuallyViewModel, AddDeliveryAddressManuallyActionData.f, "No network connection. Please retry.");
                        AddDeliveryAddressManuallyViewModel.q6(addDeliveryAddressManuallyViewModel);
                        return Unit.f24250a;
                    } catch (NoResultsException unused2) {
                        addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel4;
                        addDeliveryAddressManuallyViewModel.v6("Invalid postcode");
                        AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel, addDeliveryAddressManuallyViewModel.i, false, null, null, charSequence.toString(), emptyList, null, addDeliveryAddressManuallyViewModel.p6().getString(R.string.delivery_address_error_invalid_postcode), 7);
                        return Unit.f24250a;
                    } catch (RuntimeException unused3) {
                        addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel4;
                        AddDeliveryAddressManuallyViewModel.r6(addDeliveryAddressManuallyViewModel, AddDeliveryAddressManuallyActionData.g, "Unable to load search results at this time");
                        AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel, addDeliveryAddressManuallyViewModel.i, false, null, null, null, null, null, null, 126);
                        addDeliveryAddressManuallyViewModel.j.f(new AddDeliveryAddressManuallyContract.Actions.ShowSnackbarMessage(R.string.delivery_address_search_unable_to_load_results));
                        return Unit.f24250a;
                    }
                }
            } catch (NoConnectivityException unused4) {
            } catch (NoResultsException unused5) {
            } catch (RuntimeException unused6) {
            }
        } catch (NoConnectivityException unused7) {
            addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel2;
        } catch (NoResultsException unused8) {
            addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel2;
        } catch (RuntimeException unused9) {
            addDeliveryAddressManuallyViewModel = addDeliveryAddressManuallyViewModel2;
        }
        return Unit.f24250a;
    }
}
