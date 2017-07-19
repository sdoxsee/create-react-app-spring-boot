import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import App from './App';
import FetchDemo from './Rest';
import registerServiceWorker from './registerServiceWorker';

//ReactDOM.render(<App />, document.getElementById('root'));
ReactDOM.render(
  <FetchDemo subreddit="reactjs"/>,
  document.getElementById('root')
);
registerServiceWorker();
