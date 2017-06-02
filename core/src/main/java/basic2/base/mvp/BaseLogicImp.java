package basic2.base.mvp;

/**
 * @USER: https://github.com/meikoz/
 * @DATE: 2017/5/17
 */

public class BaseLogicImp<V extends BaseView> implements BaseLogic<V> {

    private V mBaseV;

    public BaseLogicImp(V v) {
        bind(v);
    }

    @Override
    public void bind(V view) {
        this.mBaseV = view;
    }

    @Override
    public void unbind() {
        this.mBaseV = null;
    }

    @Override
    public boolean isBind() {
        return mBaseV != null;
    }

    @Override
    public V view() {
        return mBaseV;
    }
}