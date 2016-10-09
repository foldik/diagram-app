d3.select('#file-upload-container')
	.on('dragover', dragOver)
	.on('drop', dropFile);

function dragOver() {
	d3.event.stopPropagation();
	d3.event.preventDefault();
}

function dropFile() {
	var event = d3.event,
		files = event.dataTransfer.files;
	event.stopPropagation();
	event.preventDefault();

	readFileContent(files[0])
}

function readFileContent(file) {
	var reader = new FileReader();
	reader.onload = function (e) {
		console.log(e);
		console.log(e.target.result);
	}
	reader.readAsText(file);
}