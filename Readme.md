# 입력값을 입력해주는 FileReader
<img src="https://github.com/jhoon07/-java-FileReader/blob/master/problem.png" width="50%" height="50%" />


위와 같은 상황에서 입력값을 자동으로 입력해준다.

FileReader.java를 패키지에 추가한다.


```
FileRead file = new FileRead("읽어올 파일 경로");
ArrayList lists = file.read();
        
Iterator<Integer> it = lists.iterator();
        
it.next()...
```

이후 차례대로 **it.next()** 가지고 하나씩 숫자를 불러올 수 있다.

위 그림의 경우 첫번째 줄에는 삼각형의 크기가 주어진다.

```
...
...
...

int input = it.next();
```

다음 반복적으로 자신이 원하는 배열의 위치에 값을 넣어주면 된다.

```
for (int i = 1; i < input + 1; i++) {
		for (int j = 1; j < i + 1; j++) {
		    num[i][j] = it.next();
		}
}

```
