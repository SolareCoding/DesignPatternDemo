package pub.solare.designpatterndemo.mvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import pub.solare.designpatterndemo.R;
import pub.solare.designpatterndemo.databinding.MvvmVoteBinding;

public class VoteActivityMVVM extends AppCompatActivity {

    private MvvmVoteBinding mVoteBinding;
    private VoteViewModel mVoteViewModel;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mVoteBinding = DataBindingUtil.setContentView(this, R.layout.mvvm_vote);
        mVoteBinding.setLifecycleOwner(this);
        mVoteViewModel = new ViewModelProvider(this).get(VoteViewModel.class);
        mVoteBinding.setViewmodel(mVoteViewModel);
    }
}